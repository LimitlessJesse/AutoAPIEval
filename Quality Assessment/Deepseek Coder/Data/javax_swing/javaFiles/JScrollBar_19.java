import javax.swing.JScrollBar;
import javax.swing.BoundedRangeModel;

public class JScrollBar_19 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        BoundedRangeModel model = scrollBar.getModel();

        // Get the current value of the model
        int value = model.getValue();
        System.out.println("Current value: " + value);

        // Get the minimum value of the model
        int minimum = model.getMinimum();
        System.out.println("Minimum value: " + minimum);

        // Get the maximum value of the model
        int maximum = model.getMaximum();
        System.out.println("Maximum value: " + maximum);
    }
}
