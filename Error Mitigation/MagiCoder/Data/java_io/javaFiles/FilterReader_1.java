import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_1 {
    public static void main(String[] args) {
        try {
            FilterReader reader = new StringReader("Hello, World!");
            int character;
            while ((character = reader.read())!= -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
