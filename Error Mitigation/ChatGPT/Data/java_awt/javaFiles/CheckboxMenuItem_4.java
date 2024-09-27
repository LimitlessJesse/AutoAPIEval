import java.awt.CheckboxMenuItem;
import java.awt.event.ItemListener;

public class CheckboxMenuItem_4 {
    public static void main(String[] args) {
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("Example Checkbox");
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Handle item state change event
            }
        };
        
        checkboxMenuItem.addItemListener(itemListener);
        checkboxMenuItem.removeItemListener(itemListener);
    }
}
