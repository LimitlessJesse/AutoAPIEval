import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.IOException;

public class ImageReader_9 {
    public static void main(String[] args) {
        try {
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            int tileWidth = reader.getTileWidth(0);
            System.out.println("Tile width: " + tileWidth);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
