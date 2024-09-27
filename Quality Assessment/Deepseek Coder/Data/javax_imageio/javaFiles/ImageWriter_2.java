import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

public class ImageWriter_2 {
    public static void main(String[] args) {
        ImageWriter writer = null; // Assuming you have an ImageWriter instance
        ImageWriteParam writeParam = writer.getDefaultWriteParam();
        System.out.println(writeParam);
    }
}
