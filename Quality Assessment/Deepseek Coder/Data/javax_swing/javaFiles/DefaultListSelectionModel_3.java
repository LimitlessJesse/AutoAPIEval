import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DefaultListSelectionModel_3 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        DefaultListSelectionModel dlm = (DefaultListSelectionModel) list.getSelectionModel();

        // Add elements to the list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Select the first two elements
        dlm.setSelectionInterval(0, 1);
        dlm.setSelectionInterval(2, 2);

        // Print the selected elements
        System.out.println("Before clearSelection: " + dlm.getSelectedIndices());

        // Clear the selection
        dlm.clearSelection();

        // Print the selected elements after clearSelection
        System.out.println("After clearSelection: " + dlm.getSelectedIndices());
    }
}
