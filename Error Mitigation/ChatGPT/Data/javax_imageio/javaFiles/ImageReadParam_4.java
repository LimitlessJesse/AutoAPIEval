import javax.imageio.ImageReadParam;
import java.awt.Dimension;

public class ImageReadParam_4 {
    public static void main(String[] args) {
        ImageReadParam param = new ImageReadParam();
        Dimension renderSize = param.getSourceRenderSize();
        System.out.println("Rendered width: " + renderSize.getWidth());
        System.out.println("Rendered height: " + renderSize.getHeight());
    }
}
