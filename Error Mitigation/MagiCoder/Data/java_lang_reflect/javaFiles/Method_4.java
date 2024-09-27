import java.lang.reflect.Method;

public class Method_4 {
    public static void main(String[] args) throws Exception {
        Method method = Method_4.class.getMethod("getName");
        System.out.println(method.getName());
    }

    public String getName() {
        return "getName";
    }
}
