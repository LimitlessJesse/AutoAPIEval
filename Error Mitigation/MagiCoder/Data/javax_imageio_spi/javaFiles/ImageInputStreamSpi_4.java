import javax.imageio.stream.ImageInputStream;
import javax.imageio.spi.ImageInputStreamSpi;
import java.io.File;
import java.io.IOException;

public class ImageInputStreamSpi_4 {
    public static void main(String[] args) {
        ImageInputStreamSpi spi = new ImageInputStreamSpi() {
            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public boolean canUseCacheFile() {
                return false;
            }

            @Override
            public boolean needsCacheFile() {
                return false;
            }

            @Override
            public String getInputClassName() {
                return null;
            }

            @Override
            public Class<?> getInputClass() {
                return null;
            }

            @Override
            public ImageInputStream createInputStreamInstance(Object input, boolean useCache, File cacheDir) throws IOException {
                return null;
            }
        };

        try {
            ImageInputStream is = spi.createInputStreamInstance(new Object(), true, new File("/tmp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
