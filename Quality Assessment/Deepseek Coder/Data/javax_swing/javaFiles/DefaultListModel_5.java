import javax.swing.DefaultListModel;

public class DefaultListModel_5 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Element 1");
        listModel.addElement("Element 2");
        listModel.addElement("Element 3");

        int size = listModel.size();
        System.out.println("Size of the list model: " + size);
    }
}
