import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_5 {
    public static void main(String[] args) {
        PipedOutputStream output = new PipedOutputStream();
        
        try {
            output.close();
            System.out.println("PipedOutputStream closed successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while closing PipedOutputStream");
            e.printStackTrace();
        }
    }
}
