import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSpinnerUI;

public class BasicSpinnerUI_2 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        BasicSpinnerUI spinnerUI = new BasicSpinnerUI();
        spinner.setUI(spinnerUI);

        ChangeListener listener = e -> System.out.println("Spinner value changed");
        spinner.addChangeListener(listener);

        // Uninstall the listener
        spinnerUI.uninstallListeners();
    }
}
