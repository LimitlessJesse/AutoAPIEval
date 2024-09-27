import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class Proxy_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Create an invocation handler
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // Check if the method is add
                if ("add".equals(method.getName())) {
                    // Append the element to the list
                    list.add((String) args[0]);
                    // Print the list
                    System.out.println(list);
                }
                return null;
            }
        };

        // Create a proxy class
        ArrayList proxyList = (ArrayList) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), handler);

        // Use the proxy class
        proxyList.add("Hello");
    }
}
