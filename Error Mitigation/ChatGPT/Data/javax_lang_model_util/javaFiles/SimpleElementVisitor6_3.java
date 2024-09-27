import javax.lang.model.element.VariableElement;
import javax.lang.model.util.SimpleElementVisitor6;

public class SimpleElementVisitor6_3 {
    public static void main(String[] args) {
        SimpleElementVisitor6<String, String> visitor = new SimpleElementVisitor6<>() {
            @Override
            public String visitVariable(VariableElement e, String p) {
                // Custom implementation for visiting a variable element
                return "Visiting variable element: " + e.getSimpleName().toString();
            }
        };

        VariableElement variableElement = null; // Initialize with a valid VariableElement
        String result = visitor.visitVariable(variableElement, "parameter");
        System.out.println(result);
    }
}
