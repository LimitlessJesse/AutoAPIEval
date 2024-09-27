import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import java.sql.Clob;
import java.sql.SQLException;

public class SerialClob_4 {
    public static void main(String[] args) {
        try {
            // Create a SerialClob object
            char[] data = {'a', 'b', 'c', 'd', 'e'};
            SerialClob serialClob = new SerialClob(data);

            // Truncate the SerialClob object
            serialClob.truncate(3);

            // Display the truncated SerialClob object
            System.out.println("Truncated CLOB value: " + serialClob.getSubString(1, (int) serialClob.length()));
        } catch (SerialException | SQLException e) {
            e.printStackTrace();
        }
    }
}
