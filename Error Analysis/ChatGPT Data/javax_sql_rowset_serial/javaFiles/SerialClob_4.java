import javax.sql.rowset.serial.SerialClob;
import java.io.OutputStream;
import java.sql.Clob;
import java.sql.SQLException;

public class SerialClob_4 {
    public static void main(String[] args) {
        try {
            String data = "Sample data";
            Clob clob = new SerialClob(data.toCharArray());
            
            OutputStream outputStream = clob.setAsciiStream(1);
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            
            System.out.println("Data written to clob successfully.");
        } catch (SQLException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
