import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialStruct;

public class SerialStruct_1 {
    public static void main(String[] args) {
        SerialStruct serialStruct = new SerialStruct();
        try {
            Object[] attributes = serialStruct.getAttributes();
            for (Object attribute : attributes) {
                System.out.println(attribute);
            }
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
