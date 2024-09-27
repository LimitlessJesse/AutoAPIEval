import javax.swing.event.ListSelectionEvent;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import java.util.Arrays;

public class ListSelectionEvent_4 {
    public static void main(String[] args) {
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int lastIndex = e.getLastIndex();
                    System.out.println("Last index: " + lastIndex);
                }
            }
        });
    }
}
