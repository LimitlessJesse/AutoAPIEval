import java.awt.color.ColorSpace;

public class ColorSpace_2 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] colorValue = {0.5f, 0.3f, 0.8f};
        float[] rgbValue = cs.toRGB(colorValue);
        
        System.out.println("RGB Value: ");
        for (float value : rgbValue) {
            System.out.println(value);
        }
    }
}
