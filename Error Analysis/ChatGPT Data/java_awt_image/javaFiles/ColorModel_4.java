import java.awt.image.ColorModel;

public class ColorModel_4 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = 0xFF00FF; // Example pixel value
        int red = colorModel.getRed(pixel);
        System.out.println("Red value: " + red);
    }
}
