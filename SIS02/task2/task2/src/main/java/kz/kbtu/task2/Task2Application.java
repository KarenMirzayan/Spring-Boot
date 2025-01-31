package kz.kbtu.task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Task2Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Task2Application.class, args);

        Car car = context.getBean(Car.class);
        car.info();
    }

}
