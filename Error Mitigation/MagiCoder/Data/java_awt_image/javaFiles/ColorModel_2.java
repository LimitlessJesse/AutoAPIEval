import java.awt.image.ColorModel;
import java.awt.image.RGBImageFilter;

public class ColorModel_2 {
    public static void main(String[] args) {
        ColorModel colorModel = new RGBImageFilter();
        int pixel = 0xFF0000; // Example pixel value, you can replace it with your pixel value
        int blue = colorModel.getBlue(pixel);
        System.out.println("Blue component: " + blue);
    }
}
