import javax.imageio.spi.ImageReaderWriterSpi;

public class ImageReaderWriterSpi_4 {
    public static void main(String[] args) {
        ImageReaderWriterSpi spi = new ImageReaderWriterSpi() {
            @Override
            public String[] getFileSuffixes() {
                return new String[]{".jpg", ".jpeg", ".png"};
            }
        };

        String[] fileSuffixes = spi.getFileSuffixes();
        for (String suffix : fileSuffixes) {
            System.out.println(suffix);
        }
    }
}
