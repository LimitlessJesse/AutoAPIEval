import java.awt.image.PixelGrabber;

public class PixelGrabber_1 {
    public static void main(String[] args) {
        PixelGrabber pixelGrabber = new PixelGrabber(null, 0, 0, 0, 0, false);
        int width = pixelGrabber.getWidth();
        System.out.println("Width: " + width);
    }
}
