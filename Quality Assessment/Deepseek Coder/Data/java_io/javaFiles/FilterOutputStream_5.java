import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("example.txt");
            
            // Wrap FileOutputStream with FilterOutputStream
            FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
            
            // Write some data to the output stream
            String data = "Hello, World!";
            byte[] byteData = data.getBytes();
            filterOutputStream.write(byteData);
            
            // Close the output stream
            filterOutputStream.close();
            
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
