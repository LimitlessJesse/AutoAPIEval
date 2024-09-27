import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SerialClob_6 {
    public static void main(String[] args) {
        String url = "jdbc:derby:memory:test;create=true";
        try (Connection conn = DriverManager.getConnection(url)) {
            Clob clob = conn.createClob();
            clob.setString(1, "Hello, World!");
            SerialClob serialClob = new SerialClob(clob.getSubString(1, (int) clob.length()));
            serialClob.truncate(5);
            System.out.println(serialClob.getSubString(1, (int) serialClob.length()));
        } catch (SQLException | SerialException e) {
            e.printStackTrace();
        }
    }
}
