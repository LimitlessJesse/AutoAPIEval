import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

public class CallSite_4 {
    public static void main(String[] args) {
        CallSite cs = CallSite.makeSite(MethodType.methodType(void.class));
        MethodHandle target = MethodHandles.empty(MethodType.methodType(void.class));
        cs.setTarget(target);
    }
}
