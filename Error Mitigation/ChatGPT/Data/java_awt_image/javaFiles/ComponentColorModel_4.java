import java.awt.image.ComponentColorModel;

public class ComponentColorModel_4 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel();
        int pixel = 123456; // Example pixel value
        int redComponent = colorModel.getRed(pixel);
        System.out.println("Red color component: " + redComponent);
    }
}
