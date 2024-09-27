import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_1 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FilterInputStream(System.in) {
                @Override
                public int read() throws IOException {
                    return super.read();
                }
            };
            int data = inputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
