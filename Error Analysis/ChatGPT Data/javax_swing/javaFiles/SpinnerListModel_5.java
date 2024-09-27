import javax.swing.SpinnerListModel;
import java.util.Arrays;
import java.util.List;

public class SpinnerListModel_5 {
    public static void main(String[] args) {
        SpinnerListModel model = new SpinnerListModel();
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        model.setList(list);
        System.out.println(model.getList());
    }
}
