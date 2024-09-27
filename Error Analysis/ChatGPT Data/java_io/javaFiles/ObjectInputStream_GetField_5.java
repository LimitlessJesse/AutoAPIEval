import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.FileInputStream;
import java.io.IOException;

public class ObjectInputStream_GetField_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ObjectStreamClass osc = ObjectStreamClass.lookup(Main.class);
            ObjectInputStream.GetField fields = ois.readFields();
            
            float value = fields.get("fieldName", 0.0f);
            System.out.println("Value: " + value);
            
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
