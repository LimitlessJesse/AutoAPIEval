import java.io.*;

public class InputStreamReader_3 {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            int charRead = reader.read();
            System.out.println("Character read: " + (char) charRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
