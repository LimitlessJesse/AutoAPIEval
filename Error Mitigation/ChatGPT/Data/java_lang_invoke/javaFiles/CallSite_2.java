import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

public class CallSite_2 {
    public static void main(String[] args) {
        CallSite callSite = new CallSite() {
            private MethodHandle target = null;

            @Override
            public MethodHandle getTarget() {
                return target;
            }

            @Override
            public void setTarget(MethodHandle newTarget) {
                if (newTarget == null) {
                    throw new NullPointerException("Proposed new target is null");
                }
                if (!newTarget.type().equals(target.type())) {
                    throw new WrongMethodTypeException("Proposed new target has a method type that differs from the previous target");
                }
                target = newTarget;
            }
        };
    }
}
