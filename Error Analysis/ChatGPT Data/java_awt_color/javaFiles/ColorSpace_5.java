import java.awt.color.ColorSpace;

public class ColorSpace_5 {
    public static void main(String[] args) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        int type = cs.getType();
        System.out.println("Color space type: " + type);
    }
}
