import java.lang.invoke.MethodType;

public class MethodType_5 {
    public static void main(String[] args) {
        MethodType mt = MethodType.methodType(void.class, int.class, String.class);
        System.out.println("Original MethodType: " + mt);

        MethodType newMt = mt.insertParameterTypes(1, double.class);
        System.out.println("New MethodType with inserted parameter type: " + newMt);
    }
}
