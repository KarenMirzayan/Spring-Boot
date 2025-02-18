package kz.kbtu.task1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Task1Application.class, args);
        GenericSpringEventPublisher publisher = context.getBean(GenericSpringEventPublisher.class);

        publisher.publishEvent("First Event", true);
        publisher.publishEvent("Second Event", false);
    }

}
