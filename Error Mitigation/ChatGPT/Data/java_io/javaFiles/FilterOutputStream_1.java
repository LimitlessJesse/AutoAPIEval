import java.io.FilterOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilterOutputStream_1 {
    public static void main(String[] args) {
        try {
            FilterOutputStream fos = new FilterOutputStream(new FileOutputStream("output.txt"));
            int b = 65; // ASCII value of 'A'
            fos.write(b);
            fos.close();
            System.out.println("Byte is written to the output stream.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
