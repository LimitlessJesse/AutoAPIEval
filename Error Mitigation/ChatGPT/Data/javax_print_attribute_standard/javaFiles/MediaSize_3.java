import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;

public class MediaSize_3 {
    public static void main(String[] args) {
        float x = 8.5f; // X dimension
        float y = 11.0f; // Y dimension
        int units = MediaSize.INCH; // Unit conversion factor

        MediaSizeName mediaSizeName = MediaSize.findMedia(x, y, units);
        System.out.println("Matching MediaSizeName: " + mediaSizeName);
    }
}
