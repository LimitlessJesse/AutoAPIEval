import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class DefaultTableModel_2 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        Vector<Object> rowData = new Vector<>();
        rowData.add("Value1");
        rowData.add("Value2");
        
        model.insertRow(0, rowData);
        
        System.out.println(model.getDataVector());
    }
}
