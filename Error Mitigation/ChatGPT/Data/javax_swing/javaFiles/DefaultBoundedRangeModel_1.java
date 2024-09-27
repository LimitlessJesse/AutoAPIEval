import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_1 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        int extent = model.getExtent();
        System.out.println("Extent: " + extent);
    }
}
