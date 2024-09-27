import javax.swing.SpinnerListModel;

public class SpinnerListModel_1 {
    public static void main(String[] args) {
        String[] values = {"One", "Two", "Three"};
        SpinnerListModel model = new SpinnerListModel(values);
        
        System.out.println("Current value: " + model.getValue());
        System.out.println("Next value: " + model.getNextValue());
    }
}
