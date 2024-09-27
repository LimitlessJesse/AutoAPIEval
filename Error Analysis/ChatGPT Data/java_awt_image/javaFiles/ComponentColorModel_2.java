import java.awt.image.ComponentColorModel;

public class ComponentColorModel_2 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel(null, false, false, 0, 0);
        int rgb = 16711680; // Example RGB value
        int red = colorModel.getRed(rgb);
        System.out.println("Red value: " + red);
    }
}
