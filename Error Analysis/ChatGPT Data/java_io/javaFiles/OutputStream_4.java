import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_4 {
    public static void main(String[] args) {
        try {
            String text = "Hello, this is a test text.";
            byte[] bytes = text.getBytes();

            FileOutputStream outputStream = new FileOutputStream("output.txt");
            outputStream.write(bytes);

            outputStream.close();
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
