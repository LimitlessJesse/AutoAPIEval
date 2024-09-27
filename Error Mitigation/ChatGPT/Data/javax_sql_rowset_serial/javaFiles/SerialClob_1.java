import javax.sql.rowset.serial.SerialClob;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialException;

public class SerialClob_1 {
    public static void main(String[] args) {
        try {
            // Create a SerialClob object
            char[] data = {'H', 'e', 'l', 'l', 'o'};
            SerialClob serialClob = new SerialClob(data);

            // Get the character stream from the SerialClob object
            Reader reader = serialClob.getCharacterStream();

            // Read and print the data from the character stream
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Close the reader
            reader.close();
        } catch (SQLException | SerialException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
