import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultListSelectionModel_22 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultListSelectionModel dl = (DefaultListSelectionModel) list.getSelectionModel();

        // Add items to the list
        for (int i = 1; i <= 10; i++) {
            list.add("Item " + i);
        }

        // Add mouse listener to the list
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int min = list.getSelectedIndex();
                int max = list.getSelectedIndex();
                if (min!= -1 && max!= -1) {
                    if (min > max) {
                        int temp = min;
                        min = max;
                        max = temp;
                    }
                    dl.removeSelectionInterval(min, max);
                }
            }
        });
    }
}
