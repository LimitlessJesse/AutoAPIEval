import java.lang.reflect.Proxy;

public class Proxy_4 {
    public static void main(String[] args) {
        Class<?> proxyClass = Proxy.getProxyClass(Proxy_4.class.getClassLoader(), Proxy_4.class);
        boolean isProxy = Proxy.isProxyClass(proxyClass);
        System.out.println("Is Proxy Class: " + isProxy);
    }
}
