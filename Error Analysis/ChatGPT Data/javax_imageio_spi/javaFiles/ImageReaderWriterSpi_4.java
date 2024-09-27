import javax.imageio.spi.ImageReaderWriterSpi;

public class ImageReaderWriterSpi_4 {
    public static void main(String[] args) {
        ImageReaderWriterSpi spi = new ImageReaderWriterSpi();
        
        String[] fileSuffixes = spi.getFileSuffixes();
        
        System.out.println("Supported file suffixes:");
        for (String suffix : fileSuffixes) {
            System.out.println(suffix);
        }
    }
}
