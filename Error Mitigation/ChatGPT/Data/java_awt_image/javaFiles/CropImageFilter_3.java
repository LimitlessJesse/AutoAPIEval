import java.awt.image.CropImageFilter;

public class CropImageFilter_3 {
    public static void main(String[] args) {
        CropImageFilter filter = new CropImageFilter(0, 0, 100, 100);
        filter.setDimensions(200, 200);
    }
}
