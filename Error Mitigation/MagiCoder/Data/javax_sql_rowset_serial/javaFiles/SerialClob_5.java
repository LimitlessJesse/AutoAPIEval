import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

public class SerialClob_5 {
    public static void main(String[] args) {
        try {
            // Create a SerialClob object
            SerialClob serialClob = new SerialClob("Hello, World!");

            // Get the length of the SerialClob
            long length = serialClob.length();

            // Print the length
            System.out.println("Length of the SerialClob: " + length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
