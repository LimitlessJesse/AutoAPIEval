import javax.imageio.ImageReadParam;
import java.awt.Dimension;

public class ImageReadParam_3 {
    public static void main(String[] args) {
        ImageReadParam param = new ImageReadParam();
        Dimension size = new Dimension(200, 150); // Desired width and height
        try {
            param.setSourceRenderSize(size);
            System.out.println("Source render size set successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid width or height provided.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Image resizing is not supported by this plug-in.");
        }
    }
}
