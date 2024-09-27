import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_9 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        BoundedRangeModel boundedModel = (BoundedRangeModel) model;
        boundedModel.setExtent(10);
        System.out.println("Extent: " + boundedModel.getExtent());
    }
}
