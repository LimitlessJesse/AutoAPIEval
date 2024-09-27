import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
