import javax.swing.SpinnerListModel;

public class SpinnerListModel_3 {
    public static void main(String[] args) {
        SpinnerListModel model = new SpinnerListModel();
        model.setValue("New Value");
        System.out.println(model.getList());
    }
}
