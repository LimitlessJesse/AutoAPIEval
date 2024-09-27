import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_2 {
    public static void main(String[] args) {
        float[] iccval = {0.5f, 0.5f, 0.5f, 1.0f};
        ICC_ColorSpace icc = ICC_ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] rgb = icc.toRGB(iccval);
        System.out.println("RGB values: " + rgb[0] + ", " + rgb[1] + ", " + rgb[2]);
    }
}
