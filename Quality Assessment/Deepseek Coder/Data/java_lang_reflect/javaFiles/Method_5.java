import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method_5 {
    public static void main(String[] args) throws NoSuchMethodException {
        ArrayList<String> list = new ArrayList<>();
        Method method = ArrayList.class.getMethod("add", Object.class);
        boolean isSynthetic = method.isSynthetic();
        System.out.println("Is the 'add' method synthetic? " + isSynthetic);
    }
}
