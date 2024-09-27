import java.io.FilterReader;
import java.io.StringReader;
import java.io.IOException;

public class FilterReader_2 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        char[] buffer = new char[5];

        try {
            FilterReader filterReader = new FilterReader(new StringReader(text));

            int bytesRead = filterReader.read(buffer, 0, 5);

            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Read characters: ");
            for (char c : buffer) {
                System.out.print(c + " ");
            }

            filterReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
