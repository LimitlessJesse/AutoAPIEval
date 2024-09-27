import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

public class ComponentColorModel_5 {
    public static void main(String[] args) {
        ComponentColorModel model = new ComponentColorModel(new RGBImageFilter(), 8, 0xFF, 0xFF00, 0xFF0000);
        int pixel = 0xFF00FF00; // a pixel with red and blue components
        int alpha = model.getAlpha(pixel);
        System.out.println("Alpha value: " + alpha);
    }
}
