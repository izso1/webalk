package hu.me.iit.webalk.gyak1019;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {
	private final ApplicationContext context;


    public ThirdController(ApplicationContext context) {
        this.context = context;
    }

    @ResponseBody
    @GetMapping("/c")
    public String getRoot(){
        return (context.getBean("serviceImpl", Service.class)).getValue();
    }

    @ResponseBody
    @GetMapping("/beans")
    public String[] getBeans(){
        return context.getBeanDefinitionNames();
    }
}
