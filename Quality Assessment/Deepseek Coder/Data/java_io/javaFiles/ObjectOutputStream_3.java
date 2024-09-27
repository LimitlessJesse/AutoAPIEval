import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ObjectOutputStream_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            String str = "Hello, World!";
            byte[] strBytes = str.getBytes();
            objectOutputStream.write(strBytes, 0, strBytes.length);
            objectOutputStream.flush();
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
