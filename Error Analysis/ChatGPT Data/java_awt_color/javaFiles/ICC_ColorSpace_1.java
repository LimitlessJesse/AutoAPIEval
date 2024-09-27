import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_1 {
    public static void main(String[] args) {
        float[] rgbValue = {0.5f, 0.3f, 0.8f};
        
        ICC_ColorSpace colorSpace = new ICC_ColorSpace(ICC_Profile.getInstance(ICC_Profile.COLORSPACE_ROMM));
        float[] result = colorSpace.fromRGB(rgbValue);
        
        System.out.print("Resulting values: ");
        for(float value : result) {
            System.out.print(value + " ");
        }
    }
}
