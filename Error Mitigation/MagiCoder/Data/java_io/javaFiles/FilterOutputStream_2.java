import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_2 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FilterOutputStream(System.out) {
                @Override
                public void write(int b) throws IOException {
                    super.write(b);
                }
            };
            outputStream.write('H');
            outputStream.write('e');
            outputStream.write('l');
            outputStream.write('l');
            outputStream.write('o');
            outputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
