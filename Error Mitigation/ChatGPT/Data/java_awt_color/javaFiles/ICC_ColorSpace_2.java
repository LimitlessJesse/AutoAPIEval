import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_2 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace();
        float[] colorValue = {0.5f, 0.3f, 0.8f};
        float[] rgbValue = colorSpace.toRGB(colorValue);
        System.out.println("RGB Value: " + rgbValue[0] + ", " + rgbValue[1] + ", " + rgbValue[2]);
    }
}
