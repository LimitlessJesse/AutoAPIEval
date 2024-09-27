import javax.sql.rowset.serial.SerialRef;
import javax.sql.rowset.serial.SerialException;

public class SerialRef_2 {
    public static void main(String[] args) {
        try {
            // Create a SerialRef object
            SerialRef serialRef = new SerialRef();

            // Set an object to the SerialRef
            serialRef.setObject(new Object());

            // Get the object from the SerialRef
            Object obj = serialRef.getObject();

            System.out.println(obj);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
