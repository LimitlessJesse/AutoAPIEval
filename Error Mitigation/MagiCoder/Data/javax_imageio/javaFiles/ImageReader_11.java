import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class ImageReader_11 {
    public static void main(String[] args) {
        ImageReader reader = null; // initialize your ImageReader
        int tileIndex = 0; // initialize your tileIndex
        try {
            int xOffset = reader.getTileGridXOffset(tileIndex);
            System.out.println("X offset of tile grid: " + xOffset);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
