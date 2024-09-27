import java.awt.image.IndexColorModel;

public class IndexColorModel_2 {
    public static void main(String[] args) {
        // Sample pixel value
        int pixel = 0x00FF00; // Green color (RGB: 0, 255, 0)
        
        IndexColorModel colorModel = new IndexColorModel(8, 4, new byte[]{0, (byte)255, 0, (byte)255},
                new byte[]{0, 1, 2, 3}, new byte[]{0, 1, 2, 3}, IndexColorModel.OPAQUE);
        
        int greenValue = colorModel.getGreen(pixel);
        
        System.out.println("Green value extracted from the pixel: " + greenValue);
    }
}
