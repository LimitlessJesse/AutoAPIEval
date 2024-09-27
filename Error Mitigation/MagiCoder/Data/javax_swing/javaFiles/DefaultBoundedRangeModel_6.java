import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_6 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setValueIsAdjusting(true);
        // do something with the model
        model.setValueIsAdjusting(false);
    }
}
