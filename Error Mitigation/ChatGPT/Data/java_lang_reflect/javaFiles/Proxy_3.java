import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Proxy_3 {
    public static void main(String[] args) {
        // Create a dynamic proxy instance
        InvocationHandler handler = Proxy.getInvocationHandler(new Object());
        System.out.println("Invocation Handler: " + handler);
    }
}
