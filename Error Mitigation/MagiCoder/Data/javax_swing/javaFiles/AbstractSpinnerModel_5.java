import javax.swing.event.ChangeListener;
import javax.swing.AbstractSpinnerModel;

public class AbstractSpinnerModel_5 {
    public static void main(String[] args) {
        AbstractSpinnerModel model = new AbstractSpinnerModel() {
            @Override
            public Object getNextValue() {
                return null;
            }

            @Override
            public Object getPreviousValue() {
                return null;
            }
        };

        model.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent e) {
                System.out.println("Change event occurred");
            }
        });
    }
}
