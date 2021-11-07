package me.iit.w7scopingapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SecondaryController {

    private final Service service;

    public SecondaryController(Service service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/b")
    public String getRoot() {
        return service.getValue();
    }
}
