import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_4 {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"));
            double value = 3.14;
            dos.writeDouble(value);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
