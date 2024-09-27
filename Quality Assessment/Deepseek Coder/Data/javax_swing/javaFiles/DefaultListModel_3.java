import javax.swing.DefaultListModel;

public class DefaultListModel_3 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Element 1");
        listModel.addElement("Element 2");
        listModel.addElement("Element 3");

        System.out.println("Before removal: " + listModel);

        listModel.remove(1);

        System.out.println("After removal: " + listModel);
    }
}
