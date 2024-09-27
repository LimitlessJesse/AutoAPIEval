import java.awt.color.ColorSpace;

public class ColorSpace_2 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_CIEXYZ);
        float[] colorValue = {0.2f, 0.6f, 0.1f};
        float[] result = cs.fromCIEXYZ(colorValue);
        System.out.println("Result: ");
        for (float value : result) {
            System.out.println(value);
        }
    }
}
