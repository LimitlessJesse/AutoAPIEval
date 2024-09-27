import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_1 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(1, 0, 10, 1);
        Object nextValue = model.getNextValue();
        System.out.println("Next value: " + nextValue);
    }
}
