import java.awt.color.ColorSpace;

public class ColorSpace_1 {
    public static void main(String[] args) {
        float[] colorvalue = {0.5f, 0.5f, 0.5f};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
        float[] result = cs.fromCIEXYZ(colorvalue);
        for (float f : result) {
            System.out.println(f);
        }
    }
}
