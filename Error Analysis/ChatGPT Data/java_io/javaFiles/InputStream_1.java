import java.io.IOException;
import java.io.InputStream;

public class InputStream_1 {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        int data;
        
        try {
            System.out.println("Enter a number:");
            data = inputStream.read();
            System.out.println("You entered: " + data);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
