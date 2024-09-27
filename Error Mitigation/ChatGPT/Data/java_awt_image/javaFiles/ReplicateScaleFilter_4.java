import java.awt.image.ReplicateScaleFilter;
import java.awt.image.ColorModel;

public class ReplicateScaleFilter_4 {
    public static void main(String[] args) {
        ReplicateScaleFilter filter = new ReplicateScaleFilter();
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
