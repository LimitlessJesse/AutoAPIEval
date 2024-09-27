import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_3 {
    public static void main(String[] args) {
        float[] xyzval = {0.5f, 0.5f, 0.5f};
        ICC_ColorSpace icc = new ICC_ColorSpace(ColorSpace.CS_sRGB, xyzval, 1);
        float[] rgbval = icc.fromCIEXYZ(xyzval);
        System.out.println("RGB values: " + rgbval[0] + ", " + rgbval[1] + ", " + rgbval[2]);
    }
}
