import java.awt.image.ColorModel;

public class ColorModel_4 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = 0xFFAABBCC; // Example pixel value
        int alpha = colorModel.getAlpha(pixel);
        System.out.println("Alpha component of pixel: " + alpha);
    }
}
