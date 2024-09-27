import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.event.ChangeListener;

public class DefaultColorSelectionModel_4 {
    public static void main(String[] args) {
        DefaultColorSelectionModel colorSelectionModel = new DefaultColorSelectionModel();
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Handle state change event
            }
        };
        
        colorSelectionModel.addChangeListener(listener);
        colorSelectionModel.removeChangeListener(listener);
    }
}
