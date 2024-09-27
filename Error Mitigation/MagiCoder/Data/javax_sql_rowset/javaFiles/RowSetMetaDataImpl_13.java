import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_13 {
    public static void main(String[] args) throws SQLException {
        // Create a mock ResultSetMetaData
        ResultSetMetaData mockMetaData = new RowSetMetaDataImpl();

        // Assume we have a column index of 1
        int columnIndex = 1;

        // Call the isAutoIncrement method
        boolean isAutoIncrement = mockMetaData.isAutoIncrement(columnIndex);

        // Print the result
        System.out.println("Is column " + columnIndex + " auto-increment? " + isAutoIncrement);
    }
}
