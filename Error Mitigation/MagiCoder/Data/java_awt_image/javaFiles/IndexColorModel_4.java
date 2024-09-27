import java.awt.image.IndexColorModel;

public class IndexColorModel_4 {
    public static void main(String[] args) {
        // Create an IndexColorModel
        IndexColorModel icm = new IndexColorModel(8, 256, new byte[256], 0, 0, 0);

        // Get the green color component for a pixel
        int green = icm.getGreen(0xFF00FF);

        // Print the green color component
        System.out.println("Green color component: " + green);
    }
}
