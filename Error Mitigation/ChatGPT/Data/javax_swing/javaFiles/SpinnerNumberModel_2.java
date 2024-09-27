import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_2 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(10, 0, 100, 1);
        Object previousValue = model.getPreviousValue();
        System.out.println("Previous value: " + previousValue);
    }
}
