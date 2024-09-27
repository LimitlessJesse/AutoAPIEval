import java.awt.image.BufferedImage;

public class BufferedImage_3 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        int pixel = image.getRGB(50, 50);
        System.out.println("Pixel value at (50, 50): " + pixel);
    }
}
