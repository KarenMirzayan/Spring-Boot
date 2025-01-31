package kz.kbtu.task4;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestScopeController {
    @Autowired
    private ObjectProvider<RequestScopedBean> requestScopedBeanProvider;

    @GetMapping("/request-scope")
    public String handleRequest() {
        RequestScopedBean requestScopedBean = requestScopedBeanProvider.getObject();
        return "Request Scoped Data: " + requestScopedBean.getRequestData();
    }
}