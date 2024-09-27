import javax.imageio.IIOImage;
import java.awt.image.Raster;

public class IIOImage_4 {
    public static void main(String[] args) {
        IIOImage image = new IIOImage();
        Raster raster = image.getRaster();
        if (raster != null) {
            System.out.println("Raster found: " + raster);
        } else {
            System.out.println("No Raster available, only RenderedImage.");
        }
    }
}
