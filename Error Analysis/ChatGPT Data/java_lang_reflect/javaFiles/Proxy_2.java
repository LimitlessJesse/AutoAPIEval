import java.lang.reflect.Proxy;

public class Proxy_2 {
    public static void main(String[] args) {
        Class<?> proxyClass = Proxy.getProxyClass(Main.class.getClassLoader(), Runnable.class);
        System.out.println("Proxy class: " + proxyClass.getName());
    }
}
