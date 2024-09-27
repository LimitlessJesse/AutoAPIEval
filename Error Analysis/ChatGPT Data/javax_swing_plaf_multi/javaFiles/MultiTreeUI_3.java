import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTreeUI;

public class MultiTreeUI_3 {
    public static void main(String[] args) {
        // Example usage of the contains method
        JComponent component = new JComponent() {}; // Creating a dummy JComponent
        MultiTreeUI multiTreeUI = new MultiTreeUI(); // Creating an instance of MultiTreeUI
        
        boolean containsComponent = multiTreeUI.contains(component, 10, 20);
        System.out.println("Contains component at coordinates (10, 20): " + containsComponent);
    }
}
