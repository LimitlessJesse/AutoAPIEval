import java.awt.Image;
import java.awt.image.PixelGrabber;

public class PixelGrabber_1 {
    public static void main(String[] args) {
        Image image = // Your image object here
        PixelGrabber grabber = new PixelGrabber(image, 0, 0, -1, -1, false);
        try {
            grabber.grabPixels();
            int width = grabber.getWidth();
            System.out.println("Width of the image: " + width);
        } catch (InterruptedException e) {
            System.out.println("Pixel grab interrupted.");
        }
    }
}
