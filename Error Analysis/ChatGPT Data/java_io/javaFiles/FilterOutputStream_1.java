import java.io.FilterOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilterOutputStream_1 {
    public static void main(String[] args) {
        try {
            FilterOutputStream fos = new FilterOutputStream(new FileOutputStream("output.txt"));
            fos.write(65); // Writes the byte value for 'A' to the output stream
            fos.close();
            System.out.println("Byte has been written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
