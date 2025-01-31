package kz.kbtu.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationScopeController {
    @Autowired
    private ApplicationScopedBean applicationScopedBean;
    @GetMapping("/application-scope")
    public String getApplicationScope() {
        return "Application Scoped Data: " + applicationScopedBean.getAppData();
    }
}
