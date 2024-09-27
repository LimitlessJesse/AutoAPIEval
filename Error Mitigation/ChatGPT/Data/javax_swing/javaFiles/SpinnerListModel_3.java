import javax.swing.SpinnerListModel;
import java.util.ArrayList;
import java.util.List;

public class SpinnerListModel_3 {
    public static void main(String[] args) {
        SpinnerListModel model = new SpinnerListModel();
        List<String> list = new ArrayList<>();
        list.add("Option 1");
        list.add("Option 2");
        list.add("Option 3");
        
        model.setList(list);
        
        System.out.println(model.getList());
    }
}
