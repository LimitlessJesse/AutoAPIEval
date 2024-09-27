import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FilterOutputStream_1 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                System.out.println(b);
            }
        };

        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream);

        try {
            filterOutputStream.write('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
