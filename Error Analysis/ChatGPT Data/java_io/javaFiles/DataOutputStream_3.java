import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_3 {
    public static void main(String[] args) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));
            
            boolean value = true;
            dataOutputStream.writeBoolean(value);
            
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
