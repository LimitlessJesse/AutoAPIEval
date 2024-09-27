import java.awt.image.IndexColorModel;

public class IndexColorModel_7 {
    public static void main(String[] args) {
        // Create an IndexColorModel
        IndexColorModel icm = new IndexColorModel(8, 256, new byte[256], 0, false, -1, -1);

        // Get the RGB value of a pixel
        int pixel = 128;
        int rgb = icm.getRGB(pixel);

        // Print the RGB value
        System.out.println("RGB value: " + rgb);
    }
}
