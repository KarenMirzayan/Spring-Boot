package com.smattme.spring_boot_flyway;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlywayDatabaseSeeder implements Callback {

    @Override
    public boolean supports(Event event, Context context) {
        return event.name().equals(Event.AFTER_MIGRATE.name());
    }

    @Override
    public void handle(Event event, Context context) {
        try(var statement = context.getConnection().createStatement()) {

            var ADMIN_EMAIL = "superadmin@example.com";

            var checkQuery = "SELECT id FROM users WHERE email = '%s'"
                    .formatted(ADMIN_EMAIL);

            statement.execute(checkQuery);
            ResultSet resultSet = statement.getResultSet();
            if (resultSet.next()) return;

            var sql = "INSERT INTO users (email, name) VALUES ('%s', 'Super Admin')"
                    .formatted(ADMIN_EMAIL);


            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return true;
    }

    @Override
    public String getCallbackName() {
        return FlywayDatabaseSeeder.class.getName();
    }
}
