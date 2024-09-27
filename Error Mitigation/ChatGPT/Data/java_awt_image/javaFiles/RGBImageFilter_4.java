import java.awt.image.RGBImageFilter;
import java.awt.image.ColorModel;

public class RGBImageFilter_4 {
    public static void main(String[] args) {
        RGBImageFilter filter = new RGBImageFilter() {
            @Override
            public void substituteColorModel(ColorModel oldcm, ColorModel newcm) {
                // Implementation of substituteColorModel method
                // Registers two ColorModel objects for substitution
                // If the oldcm is encountered during any of the setPixels methods, the newcm is substituted
                // and the pixels passed through untouched (but with the new ColorModel object)
            }
        };
    }
}
