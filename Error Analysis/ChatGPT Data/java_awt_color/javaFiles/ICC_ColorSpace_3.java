import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_3 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace(ICC_Profile.getInstance(ICC_Profile.ICC_COLORSPACE_RGB));
        float maxValue = colorSpace.getMaxValue(0);
        System.out.println("Maximum value for component 0: " + maxValue);
    }
}
