import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_2 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        
        // Inserting a row at index 0 with data "data1", "data2", "data3"
        Object[] rowData = {"data1", "data2", "data3"};
        model.insertRow(0, rowData);
        
        // Displaying the table model
        System.out.println(model.getDataVector());
    }
}
