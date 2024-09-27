import javax.lang.model.element.PackageElement;
import javax.lang.model.util.ElementKindVisitor6;

public class ElementKindVisitor6_3 {
    public static void main(String[] args) {
        ElementKindVisitor6<String, String> visitor = new ElementKindVisitor6<String, String>() {
            @Override
            public String visitPackage(PackageElement e, String p) {
                // Perform actions on the package element
                return "Visited package: " + e.getSimpleName();
            }
        };

        PackageElement packageElement = // Get the package element
        String result = visitor.visitPackage(packageElement, "parameter");
        System.out.println(result);
    }
}
