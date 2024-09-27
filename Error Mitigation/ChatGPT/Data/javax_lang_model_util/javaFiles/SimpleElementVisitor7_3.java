import javax.lang.model.element.VariableElement;
import javax.lang.model.util.SimpleElementVisitor7;

public class SimpleElementVisitor7_3 {
    public static void main(String[] args) {
        SimpleElementVisitor7<String, String> visitor = new SimpleElementVisitor7<String, String>() {
            @Override
            public String visitVariable(VariableElement e, String p) {
                return defaultAction(e, p);
            }
        };
    }
}
