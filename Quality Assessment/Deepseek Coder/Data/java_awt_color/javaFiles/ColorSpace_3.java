import java.awt.color.ColorSpace;

public class ColorSpace_3 {
    public static void main(String[] args) {
        float[] colorvalue = {0.5f, 0.5f, 0.5f};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
        float[] ciexyz = cs.toCIEXYZ(colorvalue);
        System.out.println("CIEXYZ values: " + ciexyz[0] + ", " + ciexyz[1] + ", " + ciexyz[2]);
    }
}
