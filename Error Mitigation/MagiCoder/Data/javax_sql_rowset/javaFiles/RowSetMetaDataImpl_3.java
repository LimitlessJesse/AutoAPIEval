import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_3 {
    public static void main(String[] args) {
        try {
            // Create a mock ResultSetMetaData
            ResultSetMetaData mockMetaData = new RowSetMetaDataImpl();

            // Call the method
            int columnType = mockMetaData.getColumnType(1);

            // Print the result
            System.out.println("Column type: " + columnType);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
