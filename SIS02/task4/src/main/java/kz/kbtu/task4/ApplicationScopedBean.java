package kz.kbtu.task4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public class ApplicationScopedBean {
    private String appData = "Application-Wide Data";
    public String getAppData() {
        return appData;
    }
}
