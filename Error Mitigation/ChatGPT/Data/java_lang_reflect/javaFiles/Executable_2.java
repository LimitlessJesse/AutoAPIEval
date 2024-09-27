import java.lang.reflect.Executable;

public class Executable_2 {
    public static void main(String[] args) {
        try {
            Class<?> declaringClass = Executable_2.class.getDeclaredMethod("main", String[].class).getDeclaringClass();
            System.out.println("Declaring class: " + declaringClass.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
