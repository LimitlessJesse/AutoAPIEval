import java.awt.Image;
import javax.swing.GrayFilter;

public class GrayFilter_2 {
    public static void main(String[] args) {
        Image originalImage = // provide the original image here
        Image disabledImage = GrayFilter.createDisabledImage(originalImage);
        // make use of the disabledImage as needed
    }
}
