import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.util.SimpleElementVisitor6;

public class SimpleElementVisitor6_5 {
    public static void main(String[] args) {
        SimpleElementVisitor6<R, P> visitor = new SimpleElementVisitor6<R, P>() {
            @Override
            public R visitTypeParameter(TypeParameterElement e, P p) {
                // Implement custom behavior for visiting type parameter element
                return super.visitTypeParameter(e, p);
            }
        };
    }
}
