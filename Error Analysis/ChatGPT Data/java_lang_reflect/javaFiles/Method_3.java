import java.lang.reflect.Method;

public class Method_3 {
    public static void main(String[] args) {
        Method[] methods = Main.class.getMethods();
        
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println();
        }
    }
}
