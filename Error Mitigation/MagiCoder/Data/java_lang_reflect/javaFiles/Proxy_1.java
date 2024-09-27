import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxy_1 {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Method " + method.getName() + " invoked");
                return null;
            }
        };

        MyInterface myInterface = (MyInterface) Proxy.newProxyInstance(
                Proxy_1.class.getClassLoader(),
                new Class<?>[] { MyInterface.class },
                handler);

        myInterface.doSomething();
    }
}

interface MyInterface {
    void doSomething();
}
