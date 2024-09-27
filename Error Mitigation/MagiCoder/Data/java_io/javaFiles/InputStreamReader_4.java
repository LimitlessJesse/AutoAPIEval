import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_4 {
    public static void main(String[] args) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(System.in);
            // Your code here
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
