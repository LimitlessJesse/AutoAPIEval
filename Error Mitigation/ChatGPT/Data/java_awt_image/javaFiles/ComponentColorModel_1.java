import java.awt.image.ComponentColorModel;

public class ComponentColorModel_1 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel();
        int pixel = 123456; // Example pixel value
        int alpha = colorModel.getAlpha(pixel);
        System.out.println("Alpha component for pixel " + pixel + ": " + alpha);
    }
}
