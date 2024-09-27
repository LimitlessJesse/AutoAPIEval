import java.awt.color.ColorSpace;

public class ColorSpace_5 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        float[] xyzColor = {0.5f, 0.3f, 0.2f};
        float[] rgbColor = cs.fromCIEXYZ(xyzColor);
        
        System.out.println("RGB Color: ");
        for (float component : rgbColor) {
            System.out.println(component);
        }
    }
}
