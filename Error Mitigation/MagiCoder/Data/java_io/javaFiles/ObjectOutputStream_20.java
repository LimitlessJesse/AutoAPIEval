import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_20 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.dat"));
            byte[] data = {65, 66, 67, 68, 69};
            out.write(data);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
