import java.lang.reflect.Method;

public class Method_4 {
    public static void main(String[] args) {
        Method[] methods = Main.class.getDeclaredMethods();
        
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            System.out.println("Method: " + method.getName() + ", Modifiers: " + modifiers);
        }
    }
    
    private void exampleMethod() {
        // Method implementation
    }
}

