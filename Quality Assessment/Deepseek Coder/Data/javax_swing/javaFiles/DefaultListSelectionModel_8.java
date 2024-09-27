import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.ArrayList;

public class DefaultListSelectionModel_8 {
    public static void main(String[] args) {
        JList<String> list = new JList<>(new ArrayList<>());
        DefaultListSelectionModel dl = (DefaultListSelectionModel) list.getSelectionModel();
        int selectionMode = dl.getSelectionMode();
        if (selectionMode == ListSelectionModel.SINGLE_SELECTION) {
            System.out.println("Single Selection Mode");
        } else if (selectionMode == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) {
            System.out.println("Multiple Interval Selection Mode");
        } else if (selectionMode == ListSelectionModel.MULTIPLE_SELECTION) {
            System.out.println("Multiple Selection Mode");
        }
    }
}
