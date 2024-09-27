import javax.sql.rowset.serial.SerialArray;
import javax.sql.rowset.serial.SerialException;

public class SerialArray_2 {
    public static void main(String[] args) {
        try {
            SerialArray serialArray = new SerialArray();
            String baseTypeName = serialArray.getBaseTypeName();
            System.out.println("Base type name: " + baseTypeName);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
