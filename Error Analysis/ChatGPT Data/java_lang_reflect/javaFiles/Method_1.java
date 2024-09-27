import java.lang.reflect.Method;

public class Method_1 {
    public static void main(String[] args) {
        try {
            // Create an instance of the class containing the method to be invoked
            MyClass obj = new MyClass();

            // Get the Method object representing the method to be invoked
            Method method = MyClass.class.getMethod("methodName", String.class);

            // Invoke the method on the object with the specified arguments
            Object result = method.invoke(obj, "argument1", "argument2");

            // Print the result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class MyClass {
        public String methodName(String arg1, String arg2) {
            return arg1 + " " + arg2;
        }
    }
}
