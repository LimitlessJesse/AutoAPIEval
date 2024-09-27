import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_1 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Option 1");
        model.addElement("Option 2");
        model.addElement("Option 3");
        
        System.out.println("Before removing elements: " + model.getSize());
        
        model.removeAllElements();
        
        System.out.println("After removing elements: " + model.getSize());
    }
}
