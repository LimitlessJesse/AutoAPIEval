import java.awt.image.ColorModel;
import java.awt.image.RGBImageFilter;

public class ColorModel_4 {
    public static void main(String[] args) {
        ColorModel colorModel = new RGBImageFilter();
        int pixel = 0xFF0000; // Red color in RGB
        int red = colorModel.getRed(pixel);
        System.out.println("Red component: " + red);
    }
}
