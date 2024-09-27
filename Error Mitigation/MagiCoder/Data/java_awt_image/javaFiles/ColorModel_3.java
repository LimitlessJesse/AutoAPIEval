import java.awt.image.ColorModel;
import java.awt.image.RGBImageFilter;

public class ColorModel_3 {
    public static void main(String[] args) {
        ColorModel colorModel = new RGBImageFilter();
        int pixel = 0xFF00FF00; // Example pixel value
        int green = colorModel.getGreen(pixel);
        System.out.println("Green component: " + green);
    }
}
