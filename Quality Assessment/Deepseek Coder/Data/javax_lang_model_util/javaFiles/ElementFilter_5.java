import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.util.ElementFilter;
import java.util.List;

public class ElementFilter_5 {
    public static void main(String[] args) {
        // Create a list of elements
        List<Element> elements = new ArrayList<>();

        // Use the packagesIn method
        List<PackageElement> packageElements = ElementFilter.packagesIn(elements);

        // Print the package elements
        for (PackageElement packageElement : packageElements) {
            System.out.println(packageElement);
        }
    }
}
