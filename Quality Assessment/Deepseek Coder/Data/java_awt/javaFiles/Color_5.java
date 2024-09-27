import java.awt.Color;

public class Color_5 {
    public static void main(String[] args) {
        // Generate a HSB color
        float hue = 0.5f; // Hue: 0.0 - 1.0
        float saturation = 0.75f; // Saturation: 0.0 - 1.0
        float brightness = 0.5f; // Brightness: 0.0 - 1.0
        Color hsbColor = Color.getHSBColor(hue, saturation, brightness);

        // Get the RGB values
        int rgb = hsbColor.getRGB();

        // Convert RGB to Hex
        String hex = Integer.toHexString(rgb);

        // Print the Hex value
        System.out.println("HSB Color in Hex: " + hex);
    }
}
