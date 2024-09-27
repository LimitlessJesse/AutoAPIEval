import javax.imageio.spi.ImageReaderWriterSpi;

public class ImageReaderWriterSpi_5 {
    public static void main(String[] args) {
        ImageReaderWriterSpi spi = new ImageReaderWriterSpi() {
            @Override
            public String[] getMIMETypes() {
                return new String[]{"image/jpeg", "image/png"};
            }
        };

        String[] mimeTypes = spi.getMIMETypes();
        for (String mimeType : mimeTypes) {
            System.out.println(mimeType);
        }
    }
}
