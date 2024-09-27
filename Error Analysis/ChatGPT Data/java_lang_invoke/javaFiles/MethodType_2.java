import java.lang.invoke.MethodType;

public class MethodType_2 {
    public static void main(String[] args) {
        MethodType methodType = MethodType.methodType(int.class);
        int paramCount = methodType.parameterCount();
        System.out.println("Parameter count: " + paramCount);
    }
}
