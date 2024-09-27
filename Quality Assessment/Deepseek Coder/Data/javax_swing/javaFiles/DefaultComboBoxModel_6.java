import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_6 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");
        
        int size = model.getSize();
        System.out.println("Size of the model: " + size);
    }
}
