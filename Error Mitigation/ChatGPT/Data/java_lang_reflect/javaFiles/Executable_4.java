import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;

public class Executable_4 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Executable executable = clazz.getDeclaredMethod("length");
            Parameter[] parameters = executable.getParameters();
            
            for (Parameter parameter : parameters) {
                System.out.println("Parameter name: " + parameter.getName());
                System.out.println("Parameter type: " + parameter.getType());
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
