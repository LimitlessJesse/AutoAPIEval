import java.lang.invoke.MethodType;

public class MethodType_4 {
    public static void main(String[] args) {
        MethodType methodType = MethodType.methodType(int.class, String.class, int.class, double.class);
        MethodType newMethodType = methodType.dropParameterTypes(1, 3);
        System.out.println(newMethodType);
    }
}
