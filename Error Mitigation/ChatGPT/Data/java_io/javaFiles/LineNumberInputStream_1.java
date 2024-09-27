import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_1 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
        
        try {
            int data = inputStream.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
