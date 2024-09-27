import java.awt.image.IndexColorModel;

public class IndexColorModel_3 {
    public static void main(String[] args) {
        // Create an IndexColorModel
        IndexColorModel model = new IndexColorModel(8, 2, new byte[]{(byte)0x00, (byte)0xFF}, 0, true, -1, 0);

        // Get the red color component for a pixel
        int pixel = 0x00FF00; // a pixel value
        int red = model.getRed(pixel);

        System.out.println("Red color component: " + red);
    }
}
