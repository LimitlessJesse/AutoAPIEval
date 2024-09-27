import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_5 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setExtent(10);
        System.out.println("Extent set to: " + model.getExtent());
    }
}
