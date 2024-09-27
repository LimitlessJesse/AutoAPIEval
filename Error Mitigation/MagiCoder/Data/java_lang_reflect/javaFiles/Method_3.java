import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method_3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Method method = list.getClass().getMethod("add", Object.class);
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println(declaringClass.getName());
    }
}
