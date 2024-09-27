import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_3 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
        long skippedBytes = byteArrayInputStream.skip(2);
        System.out.println("Skipped " + skippedBytes + " bytes");
    }
}
