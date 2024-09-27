import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

public class DefaultRowSorter_ModelWrapper_5 {
    public static void main(String[] args) {
        TableModel model = null; // Assume you have a TableModel instance here
        DefaultRowSorter.ModelWrapper wrapper = new DefaultRowSorter.ModelWrapper(model);
        int columnCount = wrapper.getColumnCount();
        System.out.println("Number of columns: " + columnCount);
    }
}
