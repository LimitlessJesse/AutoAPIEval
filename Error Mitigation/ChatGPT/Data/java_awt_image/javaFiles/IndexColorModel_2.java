import java.awt.image.IndexColorModel;

public class IndexColorModel_2 {
    public static void main(String[] args) {
        IndexColorModel colorModel = new IndexColorModel(8, 256, new byte[256], new byte[256], new byte[256]);
        int pixel = 100; // Example pixel value
        int greenComponent = colorModel.getGreen(pixel);
        System.out.println("Green color component for pixel " + pixel + ": " + greenComponent);
    }
}
