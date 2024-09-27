import java.io.IOException;
import java.io.InputStream;
import javax.swing.ProgressMonitorInputStream;

public class ProgressMonitorInputStream_1 {
    public static void main(String[] args) {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        ProgressMonitorInputStream progressMonitorInputStream = new ProgressMonitorInputStream(null, "Reading Input", inputStream);

        try {
            int data = progressMonitorInputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
