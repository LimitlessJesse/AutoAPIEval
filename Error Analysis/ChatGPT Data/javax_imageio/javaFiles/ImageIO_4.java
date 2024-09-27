import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.ImageWriterSpi;

public class ImageIO_4 {
    public static void main(String[] args) {
        String formatName = "JPEG";
        Iterator<ImageWriter> imageWriters = ImageIO.getImageWritersByFormatName(formatName);
        
        while(imageWriters.hasNext()){
            ImageWriter writer = imageWriters.next();
            ImageWriterSpi provider = writer.getOriginatingProvider();
            System.out.println("Writer: " + writer + ", Provider: " + provider);
        }
    }
}
