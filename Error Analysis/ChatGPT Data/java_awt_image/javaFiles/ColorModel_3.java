import java.awt.image.ColorModel;

public class ColorModel_3 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        
        int pixel = 0xFF00FF; // Sample pixel value
        
        // Get the alpha component from the pixel
        int alpha = colorModel.getAlpha(pixel);
        
        System.out.println("Alpha value: " + alpha);
    }
}
