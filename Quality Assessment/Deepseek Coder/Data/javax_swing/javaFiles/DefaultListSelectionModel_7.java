import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.Arrays;

public class DefaultListSelectionModel_7 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the selection
        selectionModel.setSelectionInterval(1, 1);

        // Get the lead selection index
        int leadSelectionIndex = selectionModel.getLeadSelectionIndex();

        // Print the lead selection index
        System.out.println("Lead selection index: " + leadSelectionIndex);
    }
}
