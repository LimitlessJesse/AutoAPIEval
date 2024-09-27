import javax.imageio.ImageIO;

public class ImageIO_4 {
    public static void main(String[] args) {
        String[] writerFormatNames = ImageIO.getWriterFormatNames();
        for (String formatName : writerFormatNames) {
            System.out.println(formatName);
        }
    }
}
