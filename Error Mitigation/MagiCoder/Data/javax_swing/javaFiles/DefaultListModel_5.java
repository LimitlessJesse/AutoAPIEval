import javax.swing.DefaultListModel;

public class DefaultListModel_5 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello");
        listModel.addElement("World");
        System.out.println(listModel);
        listModel.clear();
        System.out.println(listModel);
    }
}
