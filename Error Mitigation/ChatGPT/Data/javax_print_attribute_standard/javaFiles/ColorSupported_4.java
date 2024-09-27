import javax.print.attribute.standard.ColorSupported;

public class ColorSupported_4 {
    public static void main(String[] args) {
        ColorSupported colorSupported = ColorSupported.SUPPORTED;
        Class<? extends Attribute> category = colorSupported.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
