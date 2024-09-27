import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_3 {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("output.txt"));
            byte[] data = {1, 2, 3, 4, 5};
            out.write(data, 1, 3); // writes the bytes 2, 3, 4 from the array
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
