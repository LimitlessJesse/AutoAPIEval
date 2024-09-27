import javax.sql.rowset.BaseRowSet;
import java.sql.SQLException;

public class BaseRowSet_4 {
    public static void main(String[] args) {
        BaseRowSet rowSet = new BaseRowSet(); // Instantiate BaseRowSet
        try {
            String url = rowSet.getUrl(); // Retrieve the JDBC URL
            System.out.println("JDBC URL: " + url);
        } catch (SQLException e) {
            System.out.println("Error retrieving URL: " + e.getMessage());
        }
    }
}
