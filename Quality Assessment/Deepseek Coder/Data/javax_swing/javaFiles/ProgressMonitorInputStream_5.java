import java.io.IOException;
import java.io.InputStream;
import javax.swing.ProgressMonitorInputStream;

public class ProgressMonitorInputStream_5 {
    public static void main(String[] args) {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        ProgressMonitorInputStream progressMonitorInputStream = new ProgressMonitorInputStream(null, "Reading Input", inputStream);

        try {
            progressMonitorInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        progressMonitorInputStream.reset();
    }
}
