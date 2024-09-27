import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_19 {
    public static void main(String[] args) throws SQLException {
        ResultSetMetaData metaData = new RowSetMetaDataImpl();
        boolean isWritable = metaData.isWritable(1);
        System.out.println("Is column 1 writable? " + isWritable);
    }
}
