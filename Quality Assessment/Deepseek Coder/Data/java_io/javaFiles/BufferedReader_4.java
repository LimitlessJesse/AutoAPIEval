import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class BufferedReader_4 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        BufferedReader reader = new BufferedReader(new StringReader(data));

        try {
            reader.skip(7); // Skip the first 7 characters
            String remainingData = reader.readLine();
            System.out.println(remainingData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
