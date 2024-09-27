import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialRef;

public class SerialRef_1 {
    public static void main(String[] args) {
        SerialRef serialRef = new SerialRef();
        try {
            String baseTypeName = serialRef.getBaseTypeName();
            System.out.println("Base Type Name: " + baseTypeName);
        } catch (SerialException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
