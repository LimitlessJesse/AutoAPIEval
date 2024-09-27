import javax.swing.table.DefaultTableColumnModel;

public class DefaultTableColumnModel_4 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        Object identifier = "column1";
        int index = columnModel.getColumnIndex(identifier);
        System.out.println("Index of column with identifier " + identifier + ": " + index);
    }
}
