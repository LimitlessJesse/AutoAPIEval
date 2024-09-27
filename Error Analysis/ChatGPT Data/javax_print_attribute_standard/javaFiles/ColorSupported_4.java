import javax.print.attribute.standard.ColorSupported;

public class ColorSupported_4 {
    public static void main(String[] args) {
        ColorSupported colorSupported = new ColorSupported(ColorSupported.SUPPORTED);
        System.out.println("Color support: " + colorSupported.getName());
    }
}
