import java.awt.image.BufferedImage;

public class BufferedImage_2 {
    public static void main(String[] args) {
        BufferedImage img = new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB);
        int height = img.getHeight();
        System.out.println("Image height: " + height);
    }
}
