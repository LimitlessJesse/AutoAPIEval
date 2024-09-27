import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_2 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        int maximum = model.getMaximum();
        System.out.println("Maximum value: " + maximum);
    }
}
