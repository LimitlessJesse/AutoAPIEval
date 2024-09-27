import java.awt.color.ICC_ColorSpace;
import java.awt.color.ColorSpace;

public class ICC_ColorSpace_4 {
    public static void main(String[] args) {
        float[] iccval = new float[] {0.5f, 0.5f, 0.5f, 1.0f};
        ICC_ColorSpace icc = ICC_ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] ciexyz = icc.toCIEXYZ(iccval);
        System.out.println("CIEXYZ values: ");
        for (float val : ciexyz) {
            System.out.println(val);
        }
    }
}
