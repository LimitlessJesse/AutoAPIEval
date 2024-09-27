import java.lang.Class;

public class Class_2 {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        
        for (Class<?> inter : interfaces) {
            System.out.println(inter.getName());
        }
    }
}
