import java.lang.reflect.Method;
import java.util.ArrayList;

public class Class_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);

        Class<?> listClass = list.getClass();
        Method[] methods = listClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
