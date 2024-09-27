import javax.swing.DefaultBoundedRangeModel;
import javax.swing.event.ChangeListener;

public class DefaultBoundedRangeModel_10 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        ChangeListener listener = e -> System.out.println("Value changed: " + model.getValue());
        model.addChangeListener(listener);
        
        // Simulate a change in the model's value
        model.setValue(20);
    }
}
