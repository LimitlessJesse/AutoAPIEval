import java.awt.color.ColorSpace;

public class ColorSpace_3 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] rgbValue = {0.5f, 0.3f, 0.8f};
        float[] transformedValue = cs.fromRGB(rgbValue);
        
        System.out.print("Transformed RGB value: ");
        for (float value : transformedValue) {
            System.out.print(value + " ");
        }
    }
}
