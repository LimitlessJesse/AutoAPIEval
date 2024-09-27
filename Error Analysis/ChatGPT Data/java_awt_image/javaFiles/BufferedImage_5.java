import java.awt.image.BufferedImage;

public class BufferedImage_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage subimage = image.getSubimage(10, 10, 30, 30); // Get a subimage starting at (10, 10) with width 30 and height 30
        
        // Print the width and height of the subimage
        System.out.println("Subimage width: " + subimage.getWidth());
        System.out.println("Subimage height: " + subimage.getHeight());
    }
}
