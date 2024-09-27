import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_4 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        
        System.out.println("Number of remaining bytes: " + bais.available());
    }
}
