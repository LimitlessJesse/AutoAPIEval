import javax.swing.SpinnerListModel;

public class SpinnerListModel_1 {
    public static void main(String[] args) {
        SpinnerListModel spinnerListModel = new SpinnerListModel(new String[]{"Value1", "Value2", "Value3"});
        Object nextValue = spinnerListModel.getNextValue();
        System.out.println("Next Value: " + nextValue);
    }
}
