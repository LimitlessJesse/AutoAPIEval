import javax.sql.rowset.serial.SerialClob;
import java.sql.Clob;
import java.sql.SQLException;

public class SerialClob_3 {
    public static void main(String[] args) {
        try {
            // Create a SerialClob object
            char[] data = {'a', 'b', 'c', 'd', 'e'};
            SerialClob serialClob = new SerialClob(data);

            // Get a substring from the SerialClob
            long pos = 1;
            int length = 3;
            String substring = serialClob.getSubString(pos, length);
            System.out.println("Substring: " + substring);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
