import java.lang.reflect.Parameter;
import java.lang.reflect.AnnotatedType;

public class Parameter_5 {
    public static void main(String[] args) {
        class MyClass {
            public void myMethod(int param) {
            }
        }

        try {
            Parameter[] parameters = MyClass.class.getMethod("myMethod", int.class).getParameters();
            for (Parameter parameter : parameters) {
                AnnotatedType annotatedType = parameter.getAnnotatedType();
                System.out.println("Annotated Type: " + annotatedType);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
