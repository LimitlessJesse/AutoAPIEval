import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_PutField_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);

            ObjectOutputStream.PutField putField = objectOutput.putFields();
            putField.put("name", 'A');
            objectOutput.writeFields();

            fileOutputStream.close();
            System.out.println("Field 'name' set to 'A' successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
