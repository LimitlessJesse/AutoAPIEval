import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class JList_4 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        DefaultListSelectionModel selectionModel = new DefaultListSelectionModel();
        
        list.setSelectionModel(selectionModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
