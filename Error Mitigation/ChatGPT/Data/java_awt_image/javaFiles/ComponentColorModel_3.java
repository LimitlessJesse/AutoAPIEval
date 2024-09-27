import java.awt.image.ComponentColorModel;

public class ComponentColorModel_3 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel();
        int pixel = 123456; // specify the pixel value
        int green = colorModel.getGreen(pixel);
        System.out.println("Green color component for pixel " + pixel + ": " + green);
    }
}
