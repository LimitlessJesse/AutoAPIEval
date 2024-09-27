import javax.swing.DefaultListModel;

public class DefaultListModel_3 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello");
        listModel.addElement("World");
        System.out.println(listModel);
        listModel.remove(0);
        System.out.println(listModel);
    }
}
