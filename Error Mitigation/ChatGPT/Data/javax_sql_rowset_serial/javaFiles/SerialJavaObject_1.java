import javax.sql.rowset.serial.SerialException;
import javax.sql.rowset.serial.SerialJavaObject;

public class SerialJavaObject_1 {
    public static void main(String[] args) {
        try {
            SerialJavaObject serialJavaObject = new SerialJavaObject(new Object());
            Object copy = serialJavaObject.getObject();
            System.out.println("Copy of SerialJavaObject: " + copy);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
