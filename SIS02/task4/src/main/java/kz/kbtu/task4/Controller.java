package kz.kbtu.task4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Person person;
    @Autowired
    private ApplicationContext context;

    @GetMapping("/prototype")
    public String usePrototype() {
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        prototypeBean.setState("Updated State at " + System.currentTimeMillis());
        return "Prototype Bean State: " + prototypeBean.getState();
    }

    @Autowired
    public Controller(Person person) {
        this.person = person;
    }

    @GetMapping("/get_person")
    public String getPerson() {
        return person.getName();
    }

    @GetMapping("/set_person")
    public String setName(@RequestParam String name) {
        person.setName(name);
        return "Name set to: " + name;
    }

}
