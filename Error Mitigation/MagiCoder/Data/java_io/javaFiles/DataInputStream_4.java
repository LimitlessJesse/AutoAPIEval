import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream input = new DataInputStream(System.in);
            DataInputStream dis = new DataInputStream(input);
            String str = dis.readUTF();
            System.out.println("Read: " + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
