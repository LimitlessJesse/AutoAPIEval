import java.awt.color.ColorSpace;

public class ColorSpace_4 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] colorvalue = {0.5f, 0.3f, 0.8f};
        float[] result = cs.toCIEXYZ(colorvalue);
        System.out.println("CIEXYZ values: " + result[0] + ", " + result[1] + ", " + result[2]);
    }
}
