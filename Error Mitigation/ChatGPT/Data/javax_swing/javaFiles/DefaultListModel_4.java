import javax.swing.DefaultListModel;

public class DefaultListModel_4 {
    public static void main(String[] args) {
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Apple");
        model.addElement("Banana");
        model.addElement("Orange");
        
        System.out.println("Before removal: " + model);
        
        model.removeElementAt(1);
        
        System.out.println("After removal: " + model);
    }
}
