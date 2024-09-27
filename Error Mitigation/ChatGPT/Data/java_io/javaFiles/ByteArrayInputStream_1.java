import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_1 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

        int data;
        while ((data = bais.read()) != -1) {
            System.out.println(data);
        }
    }
}
