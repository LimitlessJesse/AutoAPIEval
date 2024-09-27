import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_3 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E
        int offset = 1;
        int length = 3;
        
        FilterOutputStream filterOutputStream = new FilterOutputStream(System.out);
        
        try {
            filterOutputStream.write(data, offset, length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
