import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_2 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace(ICC_ColorSpace.CS_sRGB);
        float minValue = colorSpace.getMinValue(0);
        System.out.println("Minimum value for component 0: " + minValue);
    }
}
