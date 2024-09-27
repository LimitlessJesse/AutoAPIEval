import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_4 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Option 1");
        model.addElement("Option 2");
        
        System.out.println("Before removal: " + model.getElementAt(0)); // Output: Option 1
        
        model.removeElementAt(0);
        
        System.out.println("After removal: " + model.getElementAt(0)); // Output: Option 2
    }
}
