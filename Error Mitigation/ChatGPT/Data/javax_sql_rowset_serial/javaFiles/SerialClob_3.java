import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import java.sql.Clob;
import java.sql.SQLException;

public class SerialClob_3 {
    public static void main(String[] args) {
        try {
            // Create a SerialClob object
            char[] data = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
            SerialClob serialClob = new SerialClob(data);

            // Get a substring from the SerialClob object
            String substring = serialClob.getSubString(1, 5);
            System.out.println(substring); // Output: Hello
        } catch (SerialException | SQLException e) {
            e.printStackTrace();
        }
    }
}
