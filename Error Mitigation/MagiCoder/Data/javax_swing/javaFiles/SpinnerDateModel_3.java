import javax.swing.SpinnerDateModel;
import java.util.Date;

public class SpinnerDateModel_3 {
    public static void main(String[] args) {
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
        Date date = spinnerDateModel.getDate();
        System.out.println(date);
    }
}
