import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_14 {
    public static void main(String[] args) {
        try {
            // Create a new RowSetMetaDataImpl object
            RowSetMetaDataImpl rsmd = new RowSetMetaDataImpl();

            // Set the column index
            int columnIndex = 1;

            // Call the isCaseSensitive method
            boolean isCaseSensitive = rsmd.isCaseSensitive(columnIndex);

            // Print the result
            System.out.println("Is case sensitive: " + isCaseSensitive);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
