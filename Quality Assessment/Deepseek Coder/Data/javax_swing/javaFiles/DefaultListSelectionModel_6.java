import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.Arrays;

public class DefaultListSelectionModel_6 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel dl = (DefaultListSelectionModel) list.getSelectionModel();

        // Set selection
        dl.setSelectionInterval(1, 3);

        // Get max selection index
        int maxSelectionIndex = dl.getMaxSelectionIndex();

        // Print max selection index
        System.out.println("Maximum selection index: " + maxSelectionIndex);
    }
}
