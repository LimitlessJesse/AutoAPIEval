import java.lang.reflect.Proxy;

public class Proxy_4 {
    public static void main(String[] args) {
        // Create a proxy class
        Class<?> proxyClass = Proxy.getProxyClass(Main.class.getClassLoader(), Main.class);
        
        // Check if the class is a proxy class
        boolean isProxy = Proxy.isProxyClass(proxyClass);
        
        System.out.println("Is proxy class: " + isProxy);
    }
}
