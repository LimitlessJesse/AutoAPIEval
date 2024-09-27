import java.awt.image.BufferedImage;

public class BufferedImage_5 {
    public static void main(String[] args) {
        BufferedImage originalImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        // Assuming originalImage is initialized with some data
        
        int x = 10;
        int y = 10;
        int w = 50;
        int h = 50;
        
        BufferedImage subImage = originalImage.getSubimage(x, y, w, h);
        
        // Use the subImage as needed
    }
}
