import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_1 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        int columnCount = metaData.getColumnCount();
        System.out.println("Column Count: " + columnCount);
    }
}
