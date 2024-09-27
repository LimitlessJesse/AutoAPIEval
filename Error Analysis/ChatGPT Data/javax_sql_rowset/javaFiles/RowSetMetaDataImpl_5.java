import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_5 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        
        // Assume column index is 1
        int columnType = metaData.getColumnType(1);
        String columnTypeName = metaData.getColumnTypeName(columnType);
        
        System.out.println("Column type name: " + columnTypeName);
    }
}
