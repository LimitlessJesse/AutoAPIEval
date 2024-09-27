import java.lang.invoke.MethodType;

public class MethodType_5 {
    public static void main(String[] args) {
        MethodType mt = MethodType.genericMethodType(2, true);
        System.out.println(mt);
    }
}
