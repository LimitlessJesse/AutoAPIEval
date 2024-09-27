import java.awt.image.BufferedImage;

public class BufferedImage_3 {
    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        int type = bufferedImage.getType();
        System.out.println("Type of BufferedImage: " + type);
    }
}
