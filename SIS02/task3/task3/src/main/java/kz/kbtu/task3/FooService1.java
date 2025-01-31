package kz.kbtu.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService1 {
    @Autowired
    private FooFormatter fooFormatter;
}
