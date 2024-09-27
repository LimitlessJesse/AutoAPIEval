import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            int number = 42;
            dos.writeInt(number);
            
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
