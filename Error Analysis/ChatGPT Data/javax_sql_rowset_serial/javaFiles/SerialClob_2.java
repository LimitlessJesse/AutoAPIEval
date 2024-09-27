import javax.sql.rowset.serial.SerialClob;
import java.io.Reader;
import java.sql.SQLException;

public class SerialClob_2 {
    public static void main(String[] args) {
        try {
            // Creating a SerialClob object
            SerialClob serialClob = new SerialClob("Hello, World!".toCharArray());
            
            // Getting the character stream from the SerialClob object
            Reader reader = serialClob.getCharacterStream();
            
            // Reading and printing the data from the character stream
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            
            // Closing the reader
            reader.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
