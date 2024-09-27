import java.awt.Image;
import java.awt.image.PixelGrabber;

public class PixelGrabber_2 {
    public static void main(String[] args) {
        Image image = // initialize your image here
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        int[] pixels = new int[width * height];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, width, height, pixels, 0, width);
        try {
            pixelGrabber.grabPixels();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Image width: " + width);
        System.out.println("Image height: " + height);
    }
}
