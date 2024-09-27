import java.awt.color.ColorSpace;

public class ColorSpace_1 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
        float[] colorvalue = {0.5f, 0.5f, 0.5f};
        float[] rgb = cs.toRGB(colorvalue);

        System.out.println("RGB values: ");
        for (float v : rgb) {
            System.out.println(v);
        }
    }
}
