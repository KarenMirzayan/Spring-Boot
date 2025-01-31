package kz.kbtu.task1;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }

}
