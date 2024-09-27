import javax.sql.rowset.serial.SerialClob;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SerialClob_3 {
    public static void main(String[] args) {
        try {
            // Register the JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            // Open a connection
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");

            // Create a Clob object
            Clob clob = conn.createClob();

            // Create a SerialClob object
            SerialClob serialClob = new SerialClob(clob);

            // Get a Reader object
            Reader reader = serialClob.getCharacterStream();

            // Close the connection
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
