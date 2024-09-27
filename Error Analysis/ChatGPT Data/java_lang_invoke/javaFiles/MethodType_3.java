import java.lang.invoke.MethodType;

public class MethodType_3 {
    public static void main(String[] args) {
        MethodType mt = MethodType.methodType(void.class);
        MethodType mtNew = mt.appendParameterTypes(int.class, String.class);
        System.out.println(mtNew);
    }
}
