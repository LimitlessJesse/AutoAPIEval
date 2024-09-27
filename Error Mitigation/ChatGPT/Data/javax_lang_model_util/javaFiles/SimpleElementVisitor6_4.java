import javax.lang.model.element.ExecutableElement;
import javax.lang.model.util.SimpleElementVisitor6;

public class SimpleElementVisitor6_4 {
    public static void main(String[] args) {
        SimpleElementVisitor6<R, P> visitor = new SimpleElementVisitor6<R, P>() {
            @Override
            public R visitExecutable(ExecutableElement e, P p) {
                // Add your custom implementation here
                return super.visitExecutable(e, p);
            }
        };
    }
}
