import java.awt.image.ColorModel;

public class ColorModel_2 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = 0xFF00FF; // Example pixel value
        int greenComponent = colorModel.getGreen(pixel);
        System.out.println("Green component: " + greenComponent);
    }
}
