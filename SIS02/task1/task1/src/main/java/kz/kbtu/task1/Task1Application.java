package kz.kbtu.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Task1Application.class, args);


		NotificationSender sender = ctx.getBean(NotificationSender.class);
		sender.send("Hello!");
	}

}
