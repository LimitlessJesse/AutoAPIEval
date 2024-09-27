import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Parameter_5 {
    public static void main(String[] args) throws Exception {
        Method method = Parameter_5.class.getMethod("getModifiers");
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            int modifiers = parameter.getModifiers();
            System.out.println(Modifier.toString(modifiers));
        }
    }

    public int getModifiers() {
        return 0;
    }
}
