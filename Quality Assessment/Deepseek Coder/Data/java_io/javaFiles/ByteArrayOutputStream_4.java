import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byteArrayOutputStream.write(72);
            byteArrayOutputStream.write(101);
            byteArrayOutputStream.write(108);
            byteArrayOutputStream.write(108);
            byteArrayOutputStream.write(111);

            System.out.println(byteArrayOutputStream.toString());

            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
