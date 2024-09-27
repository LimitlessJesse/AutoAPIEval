import java.lang.Class;

public class Class_1 {
    public static void main(String[] args) {
        Class<Class_1> mainClass = Class_1.class;
        String className = mainClass.getName();
        System.out.println(className);
    }
}
