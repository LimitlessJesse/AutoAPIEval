import java.awt.image.BufferedImage;

public class BufferedImage_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 50, BufferedImage.TYPE_INT_ARGB);
        int width = image.getWidth();
        System.out.println("Image width: " + width);
    }
}
