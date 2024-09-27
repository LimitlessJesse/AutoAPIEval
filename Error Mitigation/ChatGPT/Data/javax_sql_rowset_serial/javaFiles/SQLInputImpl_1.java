import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLException;

public class SQLInputImpl_1 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl();
        try {
            String attribute = sqlInput.readString();
            System.out.println("Attribute: " + attribute);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
