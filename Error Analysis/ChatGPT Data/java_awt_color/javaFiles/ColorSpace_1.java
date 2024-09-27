import java.awt.color.ColorSpace;

public class ColorSpace_1 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        int numComponents = cs.getNumComponents();
        System.out.println("Number of components: " + numComponents);
    }
}
