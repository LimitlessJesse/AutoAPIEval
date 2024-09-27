import javax.swing.DefaultListModel;

public class DefaultListModel_5 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Orange");
        
        int index = listModel.indexOf("Banana");
        
        System.out.println("Index of Banana: " + index);
    }
}
