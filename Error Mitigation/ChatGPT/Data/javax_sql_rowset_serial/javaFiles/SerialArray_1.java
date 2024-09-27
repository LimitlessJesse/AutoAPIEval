import javax.sql.rowset.serial.SerialArray;
import javax.sql.rowset.serial.SerialException;

public class SerialArray_1 {
    public static void main(String[] args) {
        try {
            // Assuming serialArray is an instance of SerialArray
            SerialArray serialArray = new SerialArray();
            Object arrayCopy = serialArray.getArray();
            System.out.println("Array copy: " + arrayCopy);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
