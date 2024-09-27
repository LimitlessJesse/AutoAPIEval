import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_10 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(model);

        System.out.println("Current Value: " + spinner.getValue());
        System.out.println("Previous Value: " + spinner.getPreviousValue());
    }
}
