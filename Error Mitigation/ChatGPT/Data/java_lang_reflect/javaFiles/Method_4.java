import java.lang.reflect.Method;

public class Method_4 {
    public static void main(String[] args) {
        try {
            // Get the Class object for the String class
            Class<?> stringClass = String.class;
            
            // Get the method named "length" with no parameters
            Method method = stringClass.getMethod("length");
            
            // Create a new String object
            String str = "Hello";
            
            // Invoke the method on the String object
            Object result = method.invoke(str);
            
            // Print the result
            System.out.println("Length of the string: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
