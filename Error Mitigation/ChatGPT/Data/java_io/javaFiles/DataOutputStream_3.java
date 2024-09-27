import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            boolean value = true;
            dos.writeBoolean(value);
            
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
