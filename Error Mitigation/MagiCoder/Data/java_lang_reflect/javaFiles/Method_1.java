import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method_1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Method method = ArrayList.class.getMethod("add", Object.class);
        method.invoke(list, "Hello");
        System.out.println(list);
    }
}
