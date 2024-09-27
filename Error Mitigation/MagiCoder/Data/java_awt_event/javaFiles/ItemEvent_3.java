import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

public class ItemEvent_3 {
    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox("Check me");
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Checkbox deselected");
                }
            }
        });
    }
}
