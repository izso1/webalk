package hu.me.iit.webalk.gyak1019;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondaryController {
	private final Service service;

    public SecondaryController(Service service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/b")
    public String getRoot(){
        return service.getValue();
    }
}
