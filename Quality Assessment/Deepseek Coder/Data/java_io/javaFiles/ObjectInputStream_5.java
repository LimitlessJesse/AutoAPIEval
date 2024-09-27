import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            in.close();
            fileIn.close();

            if(obj instanceof Serializable) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("The object is not serializable.");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
