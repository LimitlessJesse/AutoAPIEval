import java.io.FilterInputStream;
import java.io.InputStream;

public class FilterInputStream_5 {
    public static void main(String[] args) {
        InputStream inputStream = new FilterInputStream(null) {
            @Override
            public int available() {
                return 0;
            }
        };

        int availableBytes = inputStream.available();
        System.out.println("Available bytes: " + availableBytes);
    }
}
