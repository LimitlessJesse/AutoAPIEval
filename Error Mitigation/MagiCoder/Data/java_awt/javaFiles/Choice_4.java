import java.awt.Choice;
import java.awt.event.ItemListener;

public class Choice_4 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                // Handle item state change event
            }
        });

        choice.removeItemListener(choice.getItemListeners()[0]);
    }
}
