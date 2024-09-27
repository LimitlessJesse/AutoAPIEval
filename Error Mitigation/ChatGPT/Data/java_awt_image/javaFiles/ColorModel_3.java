import java.awt.image.ColorModel;

public class ColorModel_3 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = 0xFF00FF; // Example pixel value
        int blueComponent = colorModel.getBlue(pixel);
        System.out.println("Blue component: " + blueComponent);
    }
}
