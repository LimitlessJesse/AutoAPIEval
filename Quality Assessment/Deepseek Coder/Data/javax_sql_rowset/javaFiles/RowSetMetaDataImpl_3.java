import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.SQLException;

public class RowSetMetaDataImpl_3 {
    public static void main(String[] args) {
        try {
            RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
            metaData.initFromMetaData(null, null);
            int columnType = metaData.getColumnType(1);
            System.out.println("Column Type: " + columnType);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
