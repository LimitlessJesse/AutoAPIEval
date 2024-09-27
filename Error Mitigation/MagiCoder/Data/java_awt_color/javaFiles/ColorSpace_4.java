import java.awt.color.ColorSpace;

public class ColorSpace_4 {
    public static void main(String[] args) {
        float[] colorvalue = {0.5f, 0.5f, 0.5f};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] rgb = cs.toRGB(colorvalue);
        System.out.println("RGB values: " + rgb[0] + ", " + rgb[1] + ", " + rgb[2]);
    }
}
