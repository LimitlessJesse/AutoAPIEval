import javax.imageio.spi.ImageOutputStreamSpi;
import javax.imageio.stream.ImageOutputStream;
import java.io.File;

public class ImageOutputStreamSpi_3 {
    public static void main(String[] args) {
        File file = new File("output.jpg");
        ImageOutputStreamSpi spi = new MyImageOutputStreamSpi();

        ImageOutputStream output = spi.createOutputStreamInstance(file);
        if (output != null) {
            System.out.println("ImageOutputStream created successfully.");
        } else {
            System.out.println("Failed to create ImageOutputStream.");
        }
    }
}

class MyImageOutputStreamSpi extends ImageOutputStreamSpi {
    protected MyImageOutputStreamSpi() {
        super("MyImageOutputStream", "1.0", File.class);
    }

    @Override
    public String getDescription() {
        return "Custom Image Output Stream Provider";
    }

    @Override
    public ImageOutputStream createOutputStreamInstance(Object output) {
        if (output instanceof File) {
            return new MyImageOutputStream((File) output);
        } else {
            return null;
        }
    }
}

class MyImageOutputStream extends ImageOutputStream {
    private File outputFile;

    protected MyImageOutputStream(File file) {
        this.outputFile = file;
    }

    // Implement ImageOutputStream methods here
}
