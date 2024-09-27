import java.awt.color.ColorSpace;

public class ColorSpace_4 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        boolean isCS_sRGB = cs.isCS_sRGB();
        System.out.println("Is CS_sRGB ColorSpace: " + isCS_sRGB);
    }
}
