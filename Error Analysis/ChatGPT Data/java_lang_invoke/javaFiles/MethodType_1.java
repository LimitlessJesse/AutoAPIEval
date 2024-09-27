import java.lang.invoke.MethodType;

public class MethodType_1 {
    public static void main(String[] args) {
        MethodType methodType = MethodType.methodType(int.class, int.class, int.class, int.class);
        MethodType newMethodType = methodType.dropParameterTypes(1, 3);
        System.out.println("Original Method Type: " + methodType);
        System.out.println("New Method Type: " + newMethodType);
    }
}
