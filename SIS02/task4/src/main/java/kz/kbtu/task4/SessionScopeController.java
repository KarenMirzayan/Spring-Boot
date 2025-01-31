package kz.kbtu.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("sessionScopedBean")
public class SessionScopeController {
    @Autowired
    private SessionScopedBean sessionScopedBean;

    @RequestMapping("/session-scope")
    public String sessionExample() {
        sessionScopedBean.setUserName("User - " + System.currentTimeMillis());
        return "Session Scoped User: " + sessionScopedBean.getUserName();
    }
}
