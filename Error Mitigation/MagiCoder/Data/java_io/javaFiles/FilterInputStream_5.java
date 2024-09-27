import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream_5 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FilterInputStream(null) {
                @Override
                public int available() throws IOException {
                    return super.available();
                }
            };
            System.out.println(inputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
