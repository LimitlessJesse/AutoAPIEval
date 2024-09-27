import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_10 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setValue(50);
        System.out.println("Current value: " + model.getValue());
    }
}
