import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_4 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        metaData.setColumnLabel(1, "Column1");
        metaData.setColumnLabel(2, "Column2");
        metaData.setColumnLabel(3, "Column3");

        System.out.println(metaData.getColumnLabel(1)); // prints "Column1"
        System.out.println(metaData.getColumnLabel(2)); // prints "Column2"
        System.out.println(metaData.getColumnLabel(3)); // prints "Column3"
    }
}
