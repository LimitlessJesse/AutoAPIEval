import java.awt.image.ColorModel;
import java.awt.image.RGBImageFilter;

public class ColorModel_1 {
    public static void main(String[] args) {
        ColorModel colorModel = new RGBImageFilter();
        int pixel = 0xFFAABBCC; // Example pixel value
        int alpha = colorModel.getAlpha(pixel);
        System.out.println("Alpha component of the pixel is: " + alpha);
    }
}
