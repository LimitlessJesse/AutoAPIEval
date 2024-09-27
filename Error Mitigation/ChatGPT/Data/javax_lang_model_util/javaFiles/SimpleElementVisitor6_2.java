import javax.lang.model.element.TypeElement;
import javax.lang.model.util.SimpleElementVisitor6;

public class SimpleElementVisitor6_2 {
    public static void main(String[] args) {
        SimpleElementVisitor6<R, P> visitor = new SimpleElementVisitor6<R, P>() {
            @Override
            public R visitType(TypeElement e, P p) {
                // Implement custom behavior here
                return super.visitType(e, p);
            }
        };
    }
}
