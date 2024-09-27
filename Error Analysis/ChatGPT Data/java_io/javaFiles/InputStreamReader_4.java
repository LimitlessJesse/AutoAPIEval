import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_4 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        
        try {
            isr.close();
            System.out.println("Input stream closed successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while closing the input stream");
            e.printStackTrace();
        }
    }
}
