import javax.imageio.spi.ImageTranscoderSpi;
import javax.imageio.ImageTranscoder;

public class ImageTranscoderSpi_1 {
    public static void main(String[] args) {
        ImageTranscoderSpi spi = new ImageTranscoderSpi() {
            @Override
            public ImageTranscoder createTranscoderInstance() {
                // Implement your own transcoder here
                return null;
            }
        };

        ImageTranscoder transcoder = spi.createTranscoderInstance();
        // Use the transcoder here
    }
}
