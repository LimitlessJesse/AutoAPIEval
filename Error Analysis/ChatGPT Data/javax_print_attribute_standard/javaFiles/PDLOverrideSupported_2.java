import javax.print.attribute.standard.PDLOverrideSupported;
import javax.print.attribute.Attribute;

public class PDLOverrideSupported_2 {
    public static void main(String[] args) {
        PDLOverrideSupported supported = new PDLOverrideSupported(true);
        Class<? extends Attribute> category = supported.getCategory();
        System.out.println("Category: " + category);
    }
}
