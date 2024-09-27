import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

public class ComponentColorModel_1 {
    public static void main(String[] args) {
        ComponentColorModel model = new ComponentColorModel(new RGBImageFilter(), true, true, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
        int pixel = model.createPixel(1, 2, 3, 4);
        int alpha = model.getAlpha(pixel);
        System.out.println("Alpha component: " + alpha);
    }
}
