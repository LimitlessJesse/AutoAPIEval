import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_3 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69};
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

        System.out.println("Available bytes in the input stream: " + bais.available());
    }
}
