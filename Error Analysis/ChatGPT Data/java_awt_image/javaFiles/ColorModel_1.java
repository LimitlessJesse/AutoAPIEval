import java.awt.image.ColorModel;

public class ColorModel_1 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixelSize = colorModel.getPixelSize();
        System.out.println("Pixel size: " + pixelSize);
    }
}
