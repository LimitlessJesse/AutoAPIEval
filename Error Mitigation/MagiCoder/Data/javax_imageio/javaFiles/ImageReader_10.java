import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.IOException;

public class ImageReader_10 {
    public static void main(String[] args) {
        try {
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            int tileHeight = reader.getTileHeight(0);
            System.out.println("Tile Height: " + tileHeight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
