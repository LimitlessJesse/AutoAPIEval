import java.lang.invoke.MethodType;

public class MethodType_4 {
    public static void main(String[] args) {
        MethodType mt = MethodType.methodType(void.class, int.class, Class.class);
        System.out.println(mt.changeParameterType(1, String.class));
    }
}
