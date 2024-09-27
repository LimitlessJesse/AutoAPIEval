import javax.swing.SpinnerListModel;

public class SpinnerListModel_4 {
    public static void main(String[] args) {
        SpinnerListModel model = new SpinnerListModel(new String[]{"One", "Two", "Three"});
        Object value = model.getValue();
        System.out.println("Current value: " + value);
    }
}
