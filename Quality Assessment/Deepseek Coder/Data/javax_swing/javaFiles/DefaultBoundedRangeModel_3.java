import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_3 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setRangeProperties(0, 10, 0, 1);
        int max = model.getMaximum();
        System.out.println("Maximum value: " + max);
    }
}
