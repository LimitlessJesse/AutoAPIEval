import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method_3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Method method = list.getClass().getMethod("add", Object.class);
        System.out.println(method.getName());
        method.invoke(list, "Hello");
        System.out.println(list);
    }
}
