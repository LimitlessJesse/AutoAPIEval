import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_5 {
    public static void main(String[] args) {
        try {
            FilterOutputStream fos = new FilterOutputStream(new FileOutputStream("output.txt"));
            
            // Write data to the output stream
            
            fos.close(); // Closing the output stream
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
