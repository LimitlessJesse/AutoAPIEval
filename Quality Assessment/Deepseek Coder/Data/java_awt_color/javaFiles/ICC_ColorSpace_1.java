import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_1 {
    public static void main(String[] args) {
        float[] rgbval = {0.5f, 0.5f, 0.5f};
        ICC_ColorSpace colorSpace = ICC_ColorSpace.getInstance(ICC_ColorSpace.CS_sRGB);
        float[] converted = colorSpace.fromRGB(rgbval);
        System.out.println("Converted values: ");
        for (float val : converted) {
            System.out.println(val);
        }
    }
}
