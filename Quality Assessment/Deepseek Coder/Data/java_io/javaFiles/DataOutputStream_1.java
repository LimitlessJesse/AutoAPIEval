import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a DataOutputStream object to write data to a file
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"));

            // Write an integer to the file
            int value = 123;
            dataOutputStream.write(value);

            // Close the DataOutputStream
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
