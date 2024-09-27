import javax.swing.DefaultListModel;

public class DefaultListModel_2 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello");
        listModel.addElement("World");

        String element = listModel.getElementAt(0);
        System.out.println(element);  // Output: Hello
    }
}
