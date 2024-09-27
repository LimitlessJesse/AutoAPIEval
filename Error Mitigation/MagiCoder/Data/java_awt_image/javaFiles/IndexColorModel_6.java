import java.awt.image.IndexColorModel;

public class IndexColorModel_6 {
    public static void main(String[] args) {
        // Create an IndexColorModel
        IndexColorModel model = new IndexColorModel(8, 256, new byte[256], 0, 0, 0);

        // Get the alpha value of a pixel
        int pixel = 0xFF000000; // An example pixel value
        int alpha = model.getAlpha(pixel);

        System.out.println("Alpha value: " + alpha);
    }
}
