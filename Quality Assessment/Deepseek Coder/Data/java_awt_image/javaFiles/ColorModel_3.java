import java.awt.Color;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class ColorModel_3 {
    public static void main(String[] args) {
        ColorModel cm = ColorModel.getRGBdefault();
        WritableRaster raster = cm.createCompatibleWritableRaster(10, 10);
        int pixel = raster.getPixel(5, 5, null)[0];
        Color color = new Color(pixel);
        int blue = color.getBlue();
        System.out.println("Blue value of the pixel at (5,5) is: " + blue);
    }
}
