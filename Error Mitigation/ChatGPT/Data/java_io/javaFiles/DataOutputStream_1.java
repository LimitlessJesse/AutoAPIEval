import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"));
            dos.write(65); // writing the byte value of 'A'
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
