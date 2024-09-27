import javax.swing.SpinnerListModel;
import java.util.List;

public class SpinnerListModel_4 {
    public static void main(String[] args) {
        List<String> list = new SpinnerListModel(new String[]{"One", "Two", "Three"});
        SpinnerListModel model = new SpinnerListModel(list);

        System.out.println(model.getNextValue()); // Output: Two
        System.out.println(model.getNextValue()); // Output: Three
        System.out.println(model.getNextValue()); // Output: null
    }
}
