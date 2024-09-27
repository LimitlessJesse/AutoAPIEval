import javax.swing.AbstractSpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AbstractSpinnerModel_5 {
    public static void main(String[] args) {
        AbstractSpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);

        spinnerModel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner value changed: " + spinnerModel.getValue());
            }
        });

        // Simulate a change in the spinner value
        spinnerModel.setValue(spinnerModel.getNextValue());
    }
}
