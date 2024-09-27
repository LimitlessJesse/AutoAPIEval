import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLException;

public class SQLOutputImpl_2 {
    public static void main(String[] args) {
        try {
            SQLOutputImpl sqlOutput = new SQLOutputImpl();
            String data = "Hello, World!";
            InputStream inputStream = new ByteArrayInputStream(data.getBytes());
            sqlOutput.writeAsciiStream(inputStream);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
