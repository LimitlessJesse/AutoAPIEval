import javax.swing.SpinnerListModel;

public class SpinnerListModel_2 {
    public static void main(String[] args) {
        String[] values = {"One", "Two", "Three"};
        SpinnerListModel model = new SpinnerListModel(values);
        
        Object previousValue = model.getPreviousValue();
        System.out.println("Previous value: " + previousValue);
    }
}
