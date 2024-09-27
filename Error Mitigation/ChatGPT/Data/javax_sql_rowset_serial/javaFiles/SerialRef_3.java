import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialRef;

public class SerialRef_3 {
    public static void main(String[] args) {
        SerialRef serialRef = new SerialRef();
        try {
            serialRef.setObject(new Object());
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
