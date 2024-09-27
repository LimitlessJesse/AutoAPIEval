import javax.sql.rowset.RowSetMetaData;
import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_4 {
    public static void main(String[] args) {
        try {
            // Assume we have a ResultSetMetaData object named rsmd
            ResultSetMetaData rsmd = null;

            // Assume we have a RowSetMetaDataImpl object named rs
            RowSetMetaDataImpl rs = null;

            // Assume we have a ResultSetMetaData object named rsmd
            int columnIndex = 1; // replace with the actual column index

            // Get the column type name
            String columnTypeName = rs.getColumnTypeName(columnIndex);

            System.out.println("Column type name: " + columnTypeName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
