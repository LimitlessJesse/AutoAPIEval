import java.lang.reflect.Method;

public class Class_2 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Class<?>[] interfaces = clazz.getInterfaces();

            for (Class<?> anInterface : interfaces) {
                System.out.println(anInterface.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
