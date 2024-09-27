import java.awt.image.BufferedImage;

public class BufferedImage_3 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        
        // Set RGB value at location (50, 50) to red
        setRGB(50, 50, 0xFFFF0000, image);
        
        // Display the image or perform additional operations
    }
    
    public static void setRGB(int x, int y, int rgb, BufferedImage image) {
        image.setRGB(x, y, rgb);
    }
}
