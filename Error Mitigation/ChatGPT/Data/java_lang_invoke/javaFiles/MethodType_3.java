import java.lang.invoke.MethodType;

public class MethodType_3 {
    public static void main(String[] args) {
        MethodType mt = MethodType.methodType(int.class, String.class);
        MethodType newMt = mt.changeReturnType(double.class);
        System.out.println("Original MethodType: " + mt);
        System.out.println("New MethodType with changed return type: " + newMt);
    }
}
