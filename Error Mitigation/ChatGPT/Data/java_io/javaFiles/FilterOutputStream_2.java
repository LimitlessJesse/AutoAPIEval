import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_2 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67}; // ASCII values for A, B, C
        FilterOutputStream outputStream = new FilterOutputStream(System.out);
        
        try {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
