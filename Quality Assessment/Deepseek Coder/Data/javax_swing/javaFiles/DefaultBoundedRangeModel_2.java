import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_2 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setRangeProperties(5, 10, 0, 100);
        System.out.println("Minimum value: " + model.getMinimum());
    }
}
