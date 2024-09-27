import java.awt.image.VolatileImage;

public class VolatileImage_4 {
    public static void main(String[] args) {
        VolatileImage image = new VolatileImage();
        boolean lost = image.contentsLost();
        System.out.println("Contents lost: " + lost);
    }
}
