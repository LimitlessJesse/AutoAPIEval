import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_5 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

        try {
            int availableBytes = byteArrayInputStream.available();
            System.out.println("Available bytes: " + availableBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
