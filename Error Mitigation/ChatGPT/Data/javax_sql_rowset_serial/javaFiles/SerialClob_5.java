import javax.sql.rowset.serial.SerialClob;
import java.io.OutputStream;
import java.sql.SQLException;
import java.sql.SerialException;

public class SerialClob_5 {
    public static void main(String[] args) {
        try {
            SerialClob serialClob = new SerialClob(new char[]{'a', 'b', 'c'});
            long position = 1;
            OutputStream outputStream = serialClob.setAsciiStream(position);
            // Write ASCII characters to the outputStream
            outputStream.write("Hello, World!".getBytes());
            System.out.println("Ascii characters written to CLOB successfully.");
        } catch (SerialException | SQLException e) {
            e.printStackTrace();
        }
    }
}
