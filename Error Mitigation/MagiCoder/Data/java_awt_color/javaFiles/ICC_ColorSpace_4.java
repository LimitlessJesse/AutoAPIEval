import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_4 {
    public static void main(String[] args) {
        ICC_ColorSpace icc = new ICC_ColorSpace(ColorSpace.CS_sRGB);
        float[] rgb = {1.0f, 0.5f, 0.25f};
        float[] converted = icc.fromRGB(rgb);
        for (float value : converted) {
            System.out.println(value);
        }
    }
}
