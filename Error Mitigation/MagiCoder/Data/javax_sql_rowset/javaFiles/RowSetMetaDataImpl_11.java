import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.SQLException;

public class RowSetMetaDataImpl_11 {
    public static void main(String[] args) {
        RowSetMetaDataImpl rowSetMetaData = new RowSetMetaDataImpl();
        try {
            String columnLabel = rowSetMetaData.getColumnLabel(1);
            System.out.println(columnLabel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
