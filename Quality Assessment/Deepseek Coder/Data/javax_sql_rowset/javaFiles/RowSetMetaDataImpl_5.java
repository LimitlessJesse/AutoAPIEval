import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_5 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        // Assume we have a column 1 that is auto increment
        metaData.setAutoIncrement(1, true);
        boolean isAutoIncrement = metaData.isAutoIncrement(1);
        System.out.println("Is column 1 auto increment? " + isAutoIncrement);
    }
}
