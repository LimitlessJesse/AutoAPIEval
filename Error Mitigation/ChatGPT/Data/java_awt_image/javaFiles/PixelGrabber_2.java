import java.awt.image.PixelGrabber;

public class PixelGrabber_2 {
    public static void main(String[] args) {
        PixelGrabber pixelGrabber = new PixelGrabber(null, 0, 0, 0, 0, false);
        int height = pixelGrabber.getHeight();
        System.out.println("Height: " + height);
    }
}
