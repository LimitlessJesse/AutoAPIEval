import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.event.ChangeListener;

public class DefaultColorSelectionModel_2 {
    public static void main(String[] args) {
        DefaultColorSelectionModel model = new DefaultColorSelectionModel();
        model.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(java.util.Event e) {
                // Handle the change event
            }
        });
    }
}
