import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_2 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

        int i;
        while ((i = byteArrayInputStream.read())!= -1) {
            System.out.print((char) i);
        }
    }
}
