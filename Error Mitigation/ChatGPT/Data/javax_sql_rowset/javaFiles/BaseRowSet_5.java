import javax.sql.rowset.BaseRowSet;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BaseRowSet_5 {
    public static void main(String[] args) {
        BaseRowSet rowSet = new BaseRowSet(); // Instantiate BaseRowSet
        try {
            rowSet.setType(ResultSet.TYPE_SCROLL_SENSITIVE); // Set the type to ResultSet.TYPE_SCROLL_SENSITIVE
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
