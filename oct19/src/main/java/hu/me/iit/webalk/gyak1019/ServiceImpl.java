package hu.me.iit.webalk.gyak1019;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceImpl implements Service{
	private final Dependency dependency;
    private String value;
    
    @Value("${own}")
    public void setValue(String value){
        this.value = value;
    }
    
    public ServiceImpl(Dependency dependency) {
        this.dependency = dependency;
        this.value = Double.toString(Math.random());
    }
    
    @Override
    public String getValue() {
        return value;
    }
}
