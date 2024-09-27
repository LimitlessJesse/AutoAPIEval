import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxy_1 {
    public static void main(String[] args) {
        MyInterface proxyInstance = (MyInterface) Proxy.newProxyInstance(
                Main.class.getClassLoader(),
                new Class[] { MyInterface.class },
                new CustomInvocationHandler(new MyInterfaceImpl())
        );
        
        proxyInstance.sayHello();
    }
}

interface MyInterface {
    void sayHello();
}

class MyInterfaceImpl implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello from MyInterfaceImpl");
    }
}

class CustomInvocationHandler implements InvocationHandler {
    private final MyInterface target;

    public CustomInvocationHandler(MyInterface target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoking method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After invoking method: " + method.getName());
        return result;
    }
}
