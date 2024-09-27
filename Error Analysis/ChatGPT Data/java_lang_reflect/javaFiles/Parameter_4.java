import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Parameter_4 {
    public static void main(String[] args) {
        Method[] methods = Main.class.getMethods();
        
        for(Method method : methods) {
            Parameter[] parameters = method.getParameters();
            
            for(Parameter parameter : parameters) {
                boolean isVarArgs = parameter.isVarArgs();
                System.out.println("Parameter: " + parameter.getName() + ", isVarArgs: " + isVarArgs);
            }
        }
    }
}
