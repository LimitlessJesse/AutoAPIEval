import javax.swing.DefaultListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;
import java.util.List;

public class DefaultListSelectionModel_2 {
    public static void main(String[] args) {
        DefaultListSelectionModel model = new DefaultListSelectionModel();
        List<ListSelectionListener> listeners = new ArrayList<>();
        listeners.add(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Selection changed");
            }
        });
        model.addListSelectionListener(listeners.get(0));
        model.clearSelection();
    }
}
