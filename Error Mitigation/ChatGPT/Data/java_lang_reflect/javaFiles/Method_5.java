import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Method_5 {
    public static void main(String[] args) {
        Method[] methods = Method_5.class.getMethods();
        
        for(Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            System.out.println();
        }
    }
}
