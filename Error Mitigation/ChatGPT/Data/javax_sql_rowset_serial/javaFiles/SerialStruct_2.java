import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialStruct;

public class SerialStruct_2 {
    public static void main(String[] args) {
        SerialStruct serialStruct = new SerialStruct();
        try {
            String sqlTypeName = serialStruct.getSQLTypeName();
            System.out.println("SQL Type Name: " + sqlTypeName);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
