import java.awt.Color;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class ColorModel_1 {
    public static void main(String[] args) {
        ColorModel cm = ColorModel.getRGBdefault();
        WritableRaster raster = cm.createCompatibleWritableRaster(10, 10);
        int pixel = raster.getPixel(5, 5, (int[]) null)[0];
        int red = new Color(pixel).getRed();
        System.out.println("Red value of the pixel at (5,5) is: " + red);
    }
}
