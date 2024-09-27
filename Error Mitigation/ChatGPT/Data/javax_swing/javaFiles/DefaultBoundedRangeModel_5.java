import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_5 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setRangeProperties(10, 5, 0, 100, true);
        System.out.println("Value: " + model.getValue());
        System.out.println("Extent: " + model.getExtent());
        System.out.println("Minimum: " + model.getMinimum());
        System.out.println("Maximum: " + model.getMaximum());
        System.out.println("Is Adjusting: " + model.getValueIsAdjusting());
    }
}
