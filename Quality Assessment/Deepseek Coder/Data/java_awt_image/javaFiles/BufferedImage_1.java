import java.awt.image.BufferedImage;

public class BufferedImage_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB);
        int width = image.getWidth();
        System.out.println("Width of the image: " + width);
    }
}
