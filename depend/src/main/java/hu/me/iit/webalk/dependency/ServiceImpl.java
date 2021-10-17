package hu.me.iit.webalk.dependency;

public class ServiceImpl implements Service {
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency){
        this.dependency = dependency;
    }

    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }

    @Override
    public int return5(){
        return 5;
    }

    @Override
    public int callHelpAndUsedReturnValue() {
        return dependency.helpNoParameterReturnValue();
    }
}
