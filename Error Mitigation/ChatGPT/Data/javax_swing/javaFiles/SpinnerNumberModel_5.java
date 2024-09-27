import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_5 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1); // Initial value, min value, max value, step size
        model.setStepSize(2); // Set the step size to 2
    }
}
