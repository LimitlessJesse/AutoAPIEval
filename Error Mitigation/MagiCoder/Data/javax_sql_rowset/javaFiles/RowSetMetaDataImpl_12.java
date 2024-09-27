import javax.sql.rowset.RowSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_12 {
    public static void main(String[] args) {
        RowSetMetaData metaData = new RowSetMetaDataImpl();
        try {
            String className = metaData.getColumnClassName(1);
            System.out.println("Class Name: " + className);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
