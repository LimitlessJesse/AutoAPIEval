import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.SQLException;

public class RowSetMetaDataImpl_2 {
    public static void main(String[] args) {
        RowSetMetaDataImpl rowSetMetaData = new RowSetMetaDataImpl();
        try {
            String columnName = rowSetMetaData.getColumnName(1);
            System.out.println("Column Name: " + columnName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
