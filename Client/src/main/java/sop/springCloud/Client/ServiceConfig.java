package sop.springCloud.Client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
    @Value("${resources.total}")
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }
}
