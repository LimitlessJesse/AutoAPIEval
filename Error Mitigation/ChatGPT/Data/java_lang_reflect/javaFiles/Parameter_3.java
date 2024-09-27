import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Parameter_3 {
    public static void main(String[] args) {
        class Example {
            public void exampleMethod(String str, int num) {}
        }

        try {
            java.lang.reflect.Method method = Example.class.getMethod("exampleMethod", String.class, int.class);
            java.lang.reflect.Parameter[] parameters = method.getParameters();
            for (java.lang.reflect.Parameter parameter : parameters) {
                Type parameterizedType = parameter.getParameterizedType();
                System.out.println("Parameterized Type: " + parameterizedType.getTypeName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
