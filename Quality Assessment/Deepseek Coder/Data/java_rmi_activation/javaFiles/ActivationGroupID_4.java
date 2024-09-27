import java.lang.reflect.Method;

public class ActivationGroupID_4 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.rmi.activation.ActivationGroupID");
        Method method = clazz.getDeclaredMethod("hashCode");
        method.setAccessible(true);

        Object obj = clazz.newInstance();
        int hashCode = (int) method.invoke(obj);

        System.out.println(hashCode);
    }
}
