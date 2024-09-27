import java.util.ServiceLoader;

public class ServiceLoader_2 {
    public static void main(String[] args) {
        ServiceLoader<AccountService> serviceLoader = ServiceLoader.load(AccountService.class);
        
        // Reload the service providers
        serviceLoader.reload();
        
        for(AccountService service : serviceLoader) {
            service.doSomething();
        }
    }
}

interface AccountService {
    void doSomething();
}

class MyAccountService implements AccountService {
    @Override
    public void doSomething() {
        System.out.println("Doing something in MyAccountService");
    }
}
