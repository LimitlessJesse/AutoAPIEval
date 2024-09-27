import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DefaultListSelectionModel_1 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        DefaultListSelectionModel model = (DefaultListSelectionModel) list.getSelectionModel();

        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int min = e.getFirstIndex();
                    int max = e.getLastIndex();
                    model.addSelectionInterval(min, max);
                }
            }
        });
    }
}
