import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DefaultColorSelectionModel_3 {
    public static void main(String[] args) {
        DefaultColorSelectionModel colorSelectionModel = new DefaultColorSelectionModel();
        
        colorSelectionModel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Add your implementation here
                System.out.println("Color selection changed");
            }
        });
    }
}
