import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_4 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(10, 0, 100, 1);
        System.out.println("Initial value: " + model.getNumber());

        model.setValue(20);
        System.out.println("New value: " + model.getNumber());
    }
}
