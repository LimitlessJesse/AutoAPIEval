import java.awt.image.IndexColorModel;

public class IndexColorModel_4 {
    public static void main(String[] args) {
        IndexColorModel colorModel = new IndexColorModel(8, 256, new byte[256], new byte[256], new byte[256]);
        int pixel = 100; // Example pixel value
        int alpha = colorModel.getAlpha(pixel);
        System.out.println("Alpha value for pixel " + pixel + ": " + alpha);
    }
}
