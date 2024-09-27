import java.lang.reflect.Parameter;

public class Parameter_2 {
    public static void main(String[] args) {
        Parameter[] parameters = Parameter_2.class.getMethods()[0].getParameters();
        for (Parameter parameter : parameters) {
            int modifiers = parameter.getModifiers();
            System.out.println("Modifiers for parameter: " + modifiers);
        }
    }
}
