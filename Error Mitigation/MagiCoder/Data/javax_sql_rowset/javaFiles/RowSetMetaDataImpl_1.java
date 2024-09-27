import javax.sql.rowset.RowSetMetaDataImpl;
import javax.sql.rowset.WebRowSet;
import java.sql.SQLException;

public class RowSetMetaDataImpl_1 {
    public static void main(String[] args) {
        try {
            WebRowSet rowSet = new WebRowSet();
            rowSet.setURL("http://www.example.com/data.xml");
            rowSet.execute();

            RowSetMetaDataImpl metaData = (RowSetMetaDataImpl) rowSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println("Number of columns: " + columnCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
