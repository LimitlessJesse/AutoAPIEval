import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_5 {
    public static void main(String[] args) {
        FileImageOutputStream output = null;
        try {
            // Create a new FileImageOutputStream instance
            output = new FileImageOutputStream(new File("image.jpg"));

            // Write some data to the output stream
            byte[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            output.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the output stream
            if (output!= null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
