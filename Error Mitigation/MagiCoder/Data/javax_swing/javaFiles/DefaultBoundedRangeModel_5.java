import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_5 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
        model.setValue(50);
        int value = model.getValue();
        System.out.println("The value is: " + value);
    }
}
