import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_3 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace();
        float[] rgbValue = {0.5f, 0.3f, 0.8f};
        float[] transformedValue = colorSpace.fromRGB(rgbValue);
        for (float value : transformedValue) {
            System.out.println(value);
        }
    }
}
