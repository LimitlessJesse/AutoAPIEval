import java.awt.image.ComponentColorModel;

public class ComponentColorModel_2 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel();
        int pixel = 123456; // Example pixel value
        int blueComponent = colorModel.getBlue(pixel);
        System.out.println("Blue color component: " + blueComponent);
    }
}
