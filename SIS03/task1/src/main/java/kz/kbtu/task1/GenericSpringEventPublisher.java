package kz.kbtu.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message, final boolean success) {
        System.out.println("Publishing generic event. ");
        GenericSpringEvent<String> event = new GenericSpringEvent<String>(this, message, success);
        applicationEventPublisher.publishEvent(event);
    }

    public <T> void publishEvent(T eventData, boolean success) {
        System.out.println("Publishing event in thread: " + Thread.currentThread().getName());
        GenericSpringEvent<T> event = new GenericSpringEvent<>(this, eventData, success);
        applicationEventPublisher.publishEvent(event);
    }
}