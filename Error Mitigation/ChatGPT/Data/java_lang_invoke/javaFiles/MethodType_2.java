import java.lang.invoke.MethodType;

public class MethodType_2 {
    public static void main(String[] args) {
        MethodType mt = MethodType.methodType(int.class, String.class, int.class);
        System.out.println("Original MethodType: " + mt);

        MethodType newMt = mt.changeParameterType(1, double.class);
        System.out.println("Modified MethodType: " + newMt);
    }
}
