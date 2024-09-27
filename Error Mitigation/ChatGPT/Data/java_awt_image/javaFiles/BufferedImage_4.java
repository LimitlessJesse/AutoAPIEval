import java.awt.image.BufferedImage;

public class BufferedImage_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        int x = 10;
        int y = 20;
        int rgb = 0xFF0000; // Red color
        
        image.setRGB(x, y, rgb);
        
        // Display the updated image
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                System.out.print(image.getRGB(j, i) + " ");
            }
            System.out.println();
        }
    }
}
