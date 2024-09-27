import javax.swing.DefaultListModel;

public class DefaultListModel_4 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello");
        listModel.addElement("World");
        
        // Replace "World" with "Java" at index 1
        listModel.set(1, "Java");
        
        // Print the list model
        for (int i = 0; i < listModel.size(); i++) {
            System.out.println(listModel.get(i));
        }
    }
}
