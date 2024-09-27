import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_1 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setValue(50);
        model.setExtent(100);
        int extent = model.getExtent();
        System.out.println("Extent: " + extent);
    }
}
