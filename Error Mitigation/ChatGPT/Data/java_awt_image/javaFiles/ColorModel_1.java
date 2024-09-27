import java.awt.image.ColorModel;

public class ColorModel_1 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = 0xFF00FF; // Example pixel value
        int redComponent = colorModel.getRed(pixel);
        System.out.println("Red component: " + redComponent);
    }
}
