import javax.swing.event.ChangeListener;
import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_11 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();

        ChangeListener listener = e -> System.out.println("Value changed");

        // Add the listener
        model.addChangeListener(listener);

        // Remove the listener
        model.removeChangeListener(listener);
    }
}
