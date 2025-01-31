package kz.kbtu.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
