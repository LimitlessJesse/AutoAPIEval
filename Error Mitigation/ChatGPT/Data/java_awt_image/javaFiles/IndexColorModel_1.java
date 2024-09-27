import java.awt.image.IndexColorModel;

public class IndexColorModel_1 {
    public static void main(String[] args) {
        IndexColorModel colorModel = new IndexColorModel(8, 256, new byte[256], new byte[256], new byte[256]);
        int pixel = 100; // Example pixel value
        int redComponent = colorModel.getRed(pixel);
        System.out.println("Red color component for pixel " + pixel + ": " + redComponent);
    }
}
