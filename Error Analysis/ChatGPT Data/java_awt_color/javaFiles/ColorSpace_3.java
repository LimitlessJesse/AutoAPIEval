import java.awt.color.ColorSpace;

public class ColorSpace_3 {
    public static void main(String[] args) {
        float[] color = {0.5f, 0.3f, 0.7f}; // example color values
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
        float[] xyz = cs.toCIEXYZ(color);
        System.out.println("XYZ values: " + xyz[0] + ", " + xyz[1] + ", " + xyz[2]);
    }
}
