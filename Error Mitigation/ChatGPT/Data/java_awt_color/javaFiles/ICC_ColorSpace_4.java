import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_4 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace();
        float[] colorValue = {0.5f, 0.3f, 0.8f}; // Example color values
        float[] result = colorSpace.toCIEXYZ(colorValue);
        
        System.out.println("Resulting CIEXYZ values:");
        for (float value : result) {
            System.out.println(value);
        }
    }
}
