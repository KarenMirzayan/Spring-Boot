package kz.kbtu.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope("singleton")
    public Person personSingleton() {
        Person person = new Person();
        person.setName("Karen");
        return person;
    }
}
