import java.awt.image.IndexColorModel;

public class IndexColorModel_3 {
    public static void main(String[] args) {
        IndexColorModel colorModel = new IndexColorModel(8, 256, new byte[256], new byte[256], new byte[256]);
        int pixel = 100; // Example pixel value
        int blueComponent = colorModel.getBlue(pixel);
        System.out.println("Blue color component for pixel " + pixel + ": " + blueComponent);
    }
}
