import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Class_4 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method[] methods = clazz.getMethods();

            for (Method method : methods) {
                System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + "(" + getParameterTypes(method) + ")");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getParameterTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameterTypes.length; i++) {
            sb.append(parameterTypes[i].getName());
            if (i < parameterTypes.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
