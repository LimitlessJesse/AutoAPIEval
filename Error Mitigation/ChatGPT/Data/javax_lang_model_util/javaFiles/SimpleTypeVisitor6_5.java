import javax.lang.model.type.TypeVariable;
import javax.lang.model.util.SimpleTypeVisitor6;

public class SimpleTypeVisitor6_5 {
    public static void main(String[] args) {
        SimpleTypeVisitor6<R, P> visitor = new SimpleTypeVisitor6<R, P>() {
            @Override
            public R visitTypeVariable(TypeVariable t, P p) {
                // Implement custom behavior here
                return defaultAction(t, p);
            }
        };
    }
}
