import java.awt.image.BufferedImage;

public class BufferedImage_4 {
    public static void main(String[] args) {
        // Sample BufferedImage creation
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        // Get RGB value at coordinates (5, 5)
        int rgb = getRGB(image, 5, 5);
        System.out.println("RGB value at (5, 5): " + rgb);
    }

    public static int getRGB(BufferedImage image, int x, int y) {
        return image.getRGB(x, y);
    }
}
