import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.ColorModel;

public class AreaAveragingScaleFilter_2 {
    public static void main(String[] args) {
        AreaAveragingScaleFilter filter = new AreaAveragingScaleFilter();
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 100;
        ColorModel model = ColorModel.getRGBdefault();
        int[] pixels = new int[w * h];
        int off = 0;
        int scansize = w;
        
        filter.setPixels(x, y, w, h, model, pixels, off, scansize);
    }
}
