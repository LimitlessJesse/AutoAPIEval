import javax.imageio.IIOImage;
import java.awt.image.RenderedImage;

public class IIOImage_2 {
    public static void main(String[] args) {
        IIOImage iioImage = new IIOImage(null, null, null);
        RenderedImage renderedImage = iioImage.getRenderedImage();
        System.out.println(renderedImage);
    }
}
