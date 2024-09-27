import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_3 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] buffer = new char[50];
        int readCount = 0;

        try {
            readCount = reader.read(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of characters read: " + readCount);
        System.out.println("Content read: " + new String(buffer, 0, readCount));
    }
}
