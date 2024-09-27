import javax.sql.rowset.BaseRowSet;
import java.sql.SQLException;

public class BaseRowSet_1 {
    public static void main(String[] args) {
        BaseRowSet rowSet = new BaseRowSet(); // Instantiate BaseRowSet
        try {
            rowSet.setCommand("SELECT * FROM table"); // Set the command property
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
