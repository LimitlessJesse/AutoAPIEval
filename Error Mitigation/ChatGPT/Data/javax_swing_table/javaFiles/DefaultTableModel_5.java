import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class DefaultTableModel_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        
        Vector<Vector<Object>> dataVector = new Vector<>();
        Vector<Object> row1 = new Vector<>();
        row1.add("John");
        row1.add(25);
        dataVector.add(row1);
        
        Vector<String> columnIdentifiers = new Vector<>();
        columnIdentifiers.add("Name");
        columnIdentifiers.add("Age");
        
        model.setDataVector(dataVector, columnIdentifiers);
        
        System.out.println(model.getDataVector());
    }
}
