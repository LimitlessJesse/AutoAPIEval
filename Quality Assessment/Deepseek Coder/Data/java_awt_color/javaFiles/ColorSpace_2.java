import java.awt.color.ColorSpace;

public class ColorSpace_2 {
    public static void main(String[] args) {
        float[] rgbvalue = {100, 200, 50};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_RGB);
        float[] converted = cs.fromRGB(rgbvalue);
        for (float f : converted) {
            System.out.println(f);
        }
    }
}
