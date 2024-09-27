import java.lang.reflect.Method;

public class Method_5 {
    public static void main(String[] args) {
        Method[] methods = String.class.getMethods();
        
        for(Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}
