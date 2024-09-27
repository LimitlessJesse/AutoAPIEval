import java.awt.image.ComponentColorModel;

public class ComponentColorModel_4 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel();
        int rgb = -16777216; // Black color in RGB
        int blue = colorModel.getBlue(rgb);
        System.out.println("Blue value: " + blue);
    }
}
