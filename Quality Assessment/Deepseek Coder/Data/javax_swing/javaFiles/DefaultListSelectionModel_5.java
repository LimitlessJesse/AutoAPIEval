import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.Arrays;

public class DefaultListSelectionModel_5 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel dl = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the selection
        dl.setSelectionInterval(1, 3);

        // Get the minimum selection index
        int minIndex = dl.getMinSelectionIndex();

        // Print the result
        System.out.println("Minimum selection index: " + minIndex);
    }
}
