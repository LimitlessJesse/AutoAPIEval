import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.ColorModel;

public class GraphicsConfiguration_2 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        ColorModel cm = gc.getColorModel();
        int transparency = cm.getTransparency();
        System.out.println("ColorModel: " + cm);
        System.out.println("Transparency: " + (transparency == Transparency.OPAQUE? "Opaque" : transparency == Transparency.BITMASK? "Bitmask" : "Translucent"));
    }
}
