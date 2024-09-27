import java.awt.color.ICC_ColorSpace;

public class ICC_ColorSpace_5 {
    public static void main(String[] args) {
        ICC_ColorSpace colorSpace = new ICC_ColorSpace();
        float[] colorValue = {0.5f, 0.3f, 0.8f};
        float[] transformedColor = colorSpace.fromCIEXYZ(colorValue);
        
        System.out.print("Transformed color values: ");
        for (float value : transformedColor) {
            System.out.print(value + " ");
        }
    }
}
