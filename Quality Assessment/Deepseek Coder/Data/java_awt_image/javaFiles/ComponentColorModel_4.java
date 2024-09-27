import java.awt.image.ComponentColorModel;
import java.awt.Color;

public class ComponentColorModel_4 {
    public static void main(String[] args) {
        ComponentColorModel cm = new ComponentColorModel(Color.blue.getModel());
        int bluePixel = Color.blue.getRGB();
        int blueValue = cm.getBlue(bluePixel);
        System.out.println("Blue value of the pixel: " + blueValue);
    }
}
