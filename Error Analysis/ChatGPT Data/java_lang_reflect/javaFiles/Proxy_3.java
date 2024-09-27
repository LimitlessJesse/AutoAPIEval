import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Proxy_3 {
    public static void main(String[] args) {
        InvocationHandler handler = Proxy.getInvocationHandler(proxyObject);
        // code to use the handler
    }
}
