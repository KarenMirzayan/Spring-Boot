package kz.kbtu.task4;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopedBean {
    private String requestData;

    public RequestScopedBean() {
        this.requestData = "Request Data";
    }

    public String getRequestData() {
        return requestData;
    }
}