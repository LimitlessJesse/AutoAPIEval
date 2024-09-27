import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_1 {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, 68, 69}; // ASCII values for 'ABCDE'
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);

        int data;
        while ((data = input.read())!= -1) {
            System.out.println((char) data);
        }

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
