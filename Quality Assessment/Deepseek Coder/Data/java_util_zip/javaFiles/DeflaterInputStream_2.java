import java.util.zip.DeflaterInputStream;
import java.util.zip.Deflater;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DeflaterInputStream_2 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        Deflater deflater = new Deflater();
        ByteArrayInputStream bais = new ByteArrayInputStream(input);
        DeflaterInputStream dis = new DeflaterInputStream(bais, deflater);

        try {
            int data;
            while ((data = dis.read())!= -1) {
                System.out.print((char) data);
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
