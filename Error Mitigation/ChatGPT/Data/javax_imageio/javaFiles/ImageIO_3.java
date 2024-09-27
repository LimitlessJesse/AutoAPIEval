import javax.imageio.ImageIO;

public class ImageIO_3 {
    public static void main(String[] args) {
        String[] formatNames = ImageIO.getReaderFormatNames();
        for (String formatName : formatNames) {
            System.out.println(formatName);
        }
    }
}
