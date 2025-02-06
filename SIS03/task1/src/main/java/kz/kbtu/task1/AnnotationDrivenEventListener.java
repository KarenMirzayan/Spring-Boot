package kz.kbtu.task1;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent<String> event) {
        System.out.println("Handling FIRST event in thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000); // Simulating delay in event processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished handling FIRST event: " + event.getWhat());
    }

    @EventListener(condition = "#event.success == false")
    public void handleAnotherSuccessful(GenericSpringEvent<Integer> event) {
        System.out.println("Handling SECOND event in thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished handling SECOND event: " + event.getWhat());
    }
}