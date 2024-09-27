import java.awt.image.BufferedImage;

public class BufferedImage_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        int height = image.getHeight();
        System.out.println("Height of the BufferedImage: " + height);
    }
}
