import java.io.LineNumberInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class LineNumberInputStream_1 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] byteArray = data.getBytes();

        try (LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(new ByteArrayInputStream(byteArray))) {
            int character;
            while ((character = lineNumberInputStream.read())!= -1) {
                System.out.println("Character: " + (char) character + " ASCII: " + character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
