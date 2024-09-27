import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_2 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        byte[] bytes = {65, 66, 67, 68, 69};
        byteArrayOutputStream.write(bytes, 1, 3);
        
        byte[] result = byteArrayOutputStream.toByteArray();
        for (byte b : result) {
            System.out.print(b + " ");
        }
    }
}
