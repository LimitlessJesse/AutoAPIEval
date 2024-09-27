import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_2 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        metaData.setColumnName(1, "Name");

        String columnName = metaData.getColumnName(1);
        System.out.println("Column Name: " + columnName);
    }
}
