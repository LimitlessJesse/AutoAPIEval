import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_1 {
    public static void main(String[] args) {
        try {
            LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
            int data = inputStream.read();
            System.out.println("Read data: " + data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
