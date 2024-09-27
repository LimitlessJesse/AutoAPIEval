import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.ColorModel;

public class AreaAveragingScaleFilter_3 {
    public static void main(String[] args) {
        AreaAveragingScaleFilter filter = new AreaAveragingScaleFilter();
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 100;
        ColorModel model = ColorModel.getRGBdefault();
        byte[] pixels = new byte[100];
        int off = 0;
        int scansize = 10;
        
        filter.setPixels(x, y, w, h, model, pixels, off, scansize);
    }
}
