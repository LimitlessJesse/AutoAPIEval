import javax.sql.rowset.serial.SerialClob;
import java.io.CharArrayReader;
import java.sql.Clob;
import java.sql.SQLException;

public class SerialClob_5 {
    public static void main(String[] args) {
        try {
            // Create a char array
            char[] charArray = {'a', 'b', 'c', 'd', 'e'};

            // Create a CharArrayReader
            CharArrayReader charArrayReader = new CharArrayReader(charArray);

            // Create a SerialClob object
            SerialClob serialClob = new SerialClob(charArray);

            // Set the character stream at position 2
            serialClob.setCharacterStream(2, charArrayReader);

            // Get the character stream after setting
            Clob clob = serialClob;
            char[] output = new char[5];
            clob.getCharacterStream().read(output);
            System.out.println("CLOB value after setting character stream at position 2: " + new String(output));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
