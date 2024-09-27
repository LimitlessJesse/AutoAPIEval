import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_5 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace(ICC_Profile.getInstance(ICC_ProfileRGB.TYPE_RGB));
        float[] colorvalue = {0.5f, 0.5f, 0.5f};

        float[] CIEXYZ = colorSpace.toCIEXYZ(colorvalue);

        System.out.println("CIEXYZ values: " + CIEXYZ[0] + ", " + CIEXYZ[1] + ", " + CIEXYZ[2]);
    }
}
