import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_4 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        int columnType = metaData.getColumnType(1);
        System.out.println("Column type at index 1: " + columnType);
    }
}
