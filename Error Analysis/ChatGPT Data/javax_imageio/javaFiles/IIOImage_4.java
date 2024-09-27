import javax.imageio.IIOImage;
import java.awt.image.BufferedImage;

public class IIOImage_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        IIOImage iioImage = new IIOImage(image, null, null);
        BufferedImage rasterImage = (BufferedImage) iioImage.getRaster();
        
        // Use rasterImage for further processing
    }
}
