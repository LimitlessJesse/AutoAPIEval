import javax.swing.SpinnerListModel;

public class SpinnerListModel_2 {
    public static void main(String[] args) {
        SpinnerListModel model = new SpinnerListModel(new String[]{"One", "Two", "Three"});
        Object previousValue = model.getPreviousValue();
        System.out.println("Previous Value: " + previousValue);
    }
}
