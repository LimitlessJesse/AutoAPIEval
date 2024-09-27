import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialRef;

public class SerialRef_2 {
    public static void main(String[] args) {
        try {
            SerialRef serialRef = new SerialRef();
            Object object = serialRef.getObject();
            System.out.println("Object representing the SQL structured type: " + object);
        } catch (SerialException e) {
            System.out.println("Error encountered in reference resolution: " + e.getMessage());
        }
    }
}
