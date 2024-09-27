import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Proxy_1 {
    public static void main(String[] args) {
        InvocationHandler handler = new MyInvocationHandler();
        Class[] interfaces = new Class[] { MyInterface.class };
        MyInterface proxyInstance = (MyInterface) Proxy.newProxyInstance(Proxy_1.class.getClassLoader(), interfaces, handler);
        
        proxyInstance.myMethod();
    }
}

interface MyInterface {
    void myMethod();
}

class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName() + " is being called");
        return null;
    }
}
