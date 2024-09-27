import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_12 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setValueIsAdjusting(true);
        System.out.println(model.getValueIsAdjusting());
        model.setValueIsAdjusting(false);
        System.out.println(model.getValueIsAdjusting());
    }
}
