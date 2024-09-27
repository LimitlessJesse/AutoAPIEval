import javax.sql.rowset.serial.SerialClob;
import java.sql.SQLException;

public class SerialClob_1 {
    public static void main(String[] args) {
        try {
            String data = "ABCDEF";
            SerialClob serialClob = new SerialClob(data.toCharArray());
            long length = serialClob.length();
            System.out.println("Length of SerialClob: " + length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
