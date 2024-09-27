import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

public class ComponentColorModel_4 {
    public static void main(String[] args) {
        ComponentColorModel model = new ComponentColorModel(new RGBImageFilter(), true, true, Transparency.OPAQUE, DataBuffer.TYPE_INT);
        int pixel = model.getRGB(0, 0);
        int red = model.getRed(pixel);
        System.out.println("Red component: " + red);
    }
}
