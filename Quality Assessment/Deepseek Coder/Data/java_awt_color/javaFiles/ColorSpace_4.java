import java.awt.color.ColorSpace;

public class ColorSpace_4 {
    public static void main(String[] args) {
        float[] ciexyzvalue = {0.1f, 0.2f, 0.3f};
        ColorSpace colorSpace = ColorSpace.getInstance(ColorSpace.CS_CIEXYZ);
        float[] ciexyz = colorSpace.fromCIEXYZ(ciexyzvalue);
        for (float f : ciexyz) {
            System.out.println(f);
        }
    }
}
