import javax.lang.model.type.ArrayType;
import javax.lang.model.util.SimpleTypeVisitor6;

public class SimpleTypeVisitor6_2 {
    public static void main(String[] args) {
        SimpleTypeVisitor6<R, P> visitor = new SimpleTypeVisitor6<R, P>() {
            @Override
            public R visitArray(ArrayType t, P p) {
                // Implement custom behavior here
                return defaultAction(t, p);
            }
        };
    }
}
