package kz.kbtu.task3;

import org.springframework.stereotype.Component;

@Component("fooFormatter1")
public class FooFormatter1 {
    public String format() {
        return "foo";
    }
}
