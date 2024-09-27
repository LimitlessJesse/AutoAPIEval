import javax.swing.DefaultListModel;
import javax.swing.JList;

public class JList_2 {
    public static void main(String[] args) {
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Element 1");
        model.addElement("Element 2");

        JList<String> list = new JList<>(model);
        System.out.println(list.getSelectedValue()); // Output: Element 1

        list.clearSelection();
        System.out.println(list.getSelectedValue()); // Output: null
    }
}
