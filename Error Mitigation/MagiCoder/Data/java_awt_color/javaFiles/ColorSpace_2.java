import java.awt.color.ColorSpace;

public class ColorSpace_2 {
    public static void main(String[] args) {
        float[] rgb = {1.0f, 0.5f, 0.25f};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] converted = cs.fromRGB(rgb);
        for (float f : converted) {
            System.out.println(f);
        }
    }
}
