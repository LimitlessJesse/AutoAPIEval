import javax.sql.rowset.serial.SerialClob;
import java.sql.SQLException;

public class SerialClob_10 {
    public static void main(String[] args) {
        try {
            SerialClob serialClob = new SerialClob("Hello, World!".toCharArray());
            serialClob.free();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
