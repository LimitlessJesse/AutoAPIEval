import java.awt.image.IndexColorModel;

public class IndexColorModel_5 {
    public static void main(String[] args) {
        // Create an IndexColorModel
        IndexColorModel icm = new IndexColorModel(8, 2, new byte[]{(byte)0x00, (byte)0xFF}, 0, true, -1, 0);

        // Get the blue color component for a pixel
        int blue = icm.getBlue(0x00FF00);
        System.out.println("Blue color component: " + blue);
    }
}
