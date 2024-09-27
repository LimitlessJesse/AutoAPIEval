import java.awt.color.ColorSpace;

public class ColorSpace_3 {
    public static void main(String[] args) {
        float[] colorValue = {0.5f, 0.5f, 0.5f};
        ColorSpace colorSpace = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] ciexyz = colorSpace.toCIEXYZ(colorValue);
        System.out.println("CIEXYZ: " + ciexyz[0] + ", " + ciexyz[1] + ", " + ciexyz[2]);
    }
}
