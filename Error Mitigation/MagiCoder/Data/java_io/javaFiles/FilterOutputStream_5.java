import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream) {
                @Override
                public void flush() throws IOException {
                    super.flush();
                }
            };
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            filterOutputStream.write(bytes);
            filterOutputStream.flush();
            filterOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
