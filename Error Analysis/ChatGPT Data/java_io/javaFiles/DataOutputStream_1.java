import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.write(65); // Writes the integer value 65 as a byte to the output file
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
