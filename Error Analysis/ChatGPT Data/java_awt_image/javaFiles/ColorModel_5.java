import java.awt.image.ColorModel;
import java.awt.Color;

public class ColorModel_5 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = Color.RED.getRGB(); // Example pixel with RED color
        int greenComponent = colorModel.getGreen(pixel);
        System.out.println("Green component value: " + greenComponent);
    }
}
