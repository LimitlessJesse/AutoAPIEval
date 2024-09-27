import java.awt.image.DirectColorModel;

public class DirectColorModel_4 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000);
        int pixel = 0xFF336699; // Sample pixel value
        int alpha = dcm.getAlpha(pixel);
        System.out.println("Alpha value of pixel: " + alpha);
    }
}
