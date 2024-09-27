import java.lang.reflect.Executable;

public class Executable_1 {
    public static void main(String[] args) {
        Executable executable = Main.class.getDeclaredMethods()[0];
        Class<?> declaringClass = executable.getDeclaringClass();
        System.out.println("Declaring class: " + declaringClass.getName());
    }

    public void exampleMethod() {
        // Method to showcase getDeclaringClass()
    }
}
