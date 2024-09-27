import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method_1 {
    public static void main(String[] args) throws NoSuchMethodException {
        ArrayList<String> list = new ArrayList<>();
        Method method = ArrayList.class.getMethod("add", Object.class);
        Class<?> returnType = method.getReturnType();
        System.out.println(returnType.getName());
    }
}
