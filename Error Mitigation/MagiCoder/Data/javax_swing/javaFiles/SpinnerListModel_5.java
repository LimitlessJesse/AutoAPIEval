import javax.swing.SpinnerListModel;
import java.util.List;

public class SpinnerListModel_5 {
    public static void main(String[] args) {
        List<String> list = new SpinnerListModel(new String[]{"One", "Two", "Three"});
        System.out.println(list.getPreviousValue());
    }
}
