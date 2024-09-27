import java.awt.image.PixelGrabber;

public class PixelGrabber_4 {
    public static void main(String[] args) {
        PixelGrabber pixelGrabber = new PixelGrabber(image, x, y, w, h, pixels, off, scansize);
        try {
            boolean result = pixelGrabber.grabPixels();
            System.out.println("Pixels grabbed successfully: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
