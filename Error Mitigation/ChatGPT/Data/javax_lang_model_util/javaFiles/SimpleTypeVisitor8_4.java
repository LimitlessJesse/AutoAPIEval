import javax.lang.model.type.IntersectionType;
import javax.lang.model.util.SimpleTypeVisitor8;

public class SimpleTypeVisitor8_4 {
    public static void main(String[] args) {
        SimpleTypeVisitor8<R, P> visitor = new SimpleTypeVisitor8<R, P>() {
            @Override
            public R visitIntersection(IntersectionType t, P p) {
                // Implement custom behavior for visiting IntersectionType
                return defaultAction(t, p);
            }
        };
    }
}
