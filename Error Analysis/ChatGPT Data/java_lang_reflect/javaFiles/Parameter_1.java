import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_1 {
    public static void main(String[] args) {
        Method[] methods = Main.class.getMethods();
        for(Method method : methods) {
            Parameter[] parameters = method.getParameters();
            for(Parameter parameter : parameters) {
                System.out.println("Parameter name: " + parameter.getName());
            }
        }
    }
}
