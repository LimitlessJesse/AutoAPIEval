import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class RescaleOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        RescaleOp rescaleOp = new RescaleOp(1.5f, 0.0f, null);
        BufferedImage filteredImage = rescaleOp.filter(src, dst);

        // Display the filtered image or do further processing
    }
}
