import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_5 {
    public static void main(String[] args) {
        try {
            DeflaterInputStream dis = new DeflaterInputStream(null);
            int result = dis.available();
            System.out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
