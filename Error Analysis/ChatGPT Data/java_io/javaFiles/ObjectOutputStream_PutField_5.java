import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_PutField_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Create a PutField object
            ObjectOutputStream.PutField putField = objectOutputStream.putFields();
            
            // Put a float value with a given field name
            putField.put("floatField", 3.14f);
            
            // Write the PutField object to the ObjectOutputStream
            objectOutputStream.writeFields();

            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Field value set successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
