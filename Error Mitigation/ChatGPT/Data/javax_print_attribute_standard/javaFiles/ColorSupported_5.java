import javax.print.attribute.standard.ColorSupported;

public class ColorSupported_5 {
    public static void main(String[] args) {
        ColorSupported colorSupported = ColorSupported.SUPPORTED;
        String categoryName = colorSupported.getName();
        System.out.println("Category name: " + categoryName);
    }
}
