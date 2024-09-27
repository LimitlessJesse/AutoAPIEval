import java.awt.image.BufferedImage;

public class BufferedImage_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB);
        int height = image.getHeight();
        System.out.println("Height of the image: " + height);
    }
}
