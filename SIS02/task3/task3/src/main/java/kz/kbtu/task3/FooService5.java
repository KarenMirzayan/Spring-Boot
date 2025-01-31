package kz.kbtu.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService5 {
    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;

}
