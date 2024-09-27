import javax.print.attribute.standard.PDLOverrideSupported;
import javax.print.attribute.Attribute;

public class PDLOverrideSupported_2 {
    public static void main(String[] args) {
        PDLOverrideSupported pdlOverrideSupported = new PDLOverrideSupported(PDLOverrideSupported.ATTEMPTED);
        Class<? extends Attribute> category = pdlOverrideSupported.getCategory();
        System.out.println("Printing attribute category: " + category.getName());
    }
}
