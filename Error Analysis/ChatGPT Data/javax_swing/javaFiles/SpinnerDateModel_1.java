import javax.swing.SpinnerDateModel;
import java.util.Date;

public class SpinnerDateModel_1 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        Date date = model.getDate();
        System.out.println("Current date in SpinnerDateModel: " + date);
    }
}
