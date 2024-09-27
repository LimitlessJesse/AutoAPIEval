import java.awt.image.DirectColorModel;

public class DirectColorModel_1 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, 0xFF000000);
        int pixel = 0xFFAABBCC; // Sample pixel value
        int red = dcm.getRed(pixel);
        System.out.println("Red value: " + red);
    }
}
