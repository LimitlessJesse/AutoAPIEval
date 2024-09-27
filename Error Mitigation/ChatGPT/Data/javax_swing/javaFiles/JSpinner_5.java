import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinner_5 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Add your code here to handle the change event
                System.out.println("Spinner value changed");
            }
        });
    }
}
