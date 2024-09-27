import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_3 {
    public static void main(String[] args) {
        float[] colorValue = {0.1f, 0.2f, 0.3f, 0.4f};
        ICC_ColorSpace iccColorSpace = new ICC_ColorSpace(ColorSpace.CS_CIEXYZ, colorValue.length);
        float[] transformedColorValue = iccColorSpace.fromCIEXYZ(colorValue);
        for (float value : transformedColorValue) {
            System.out.println(value);
        }
    }
}
