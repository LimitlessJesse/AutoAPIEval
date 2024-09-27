import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_5 {
    public static void main(String[] args) {
        float[] colorValue = {0.5f, 0.5f, 0.5f, 1.0f};
        ICC_ColorSpace iccColorSpace = new ICC_ColorSpace(ColorSpace.CS_sRGB, null, null);
        float[] ciexyz = iccColorSpace.toCIEXYZ(colorValue);
        for (float f : ciexyz) {
            System.out.println(f);
        }
    }
}
