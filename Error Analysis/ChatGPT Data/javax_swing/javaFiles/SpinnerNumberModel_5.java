import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_5 {
    public static void main(String[] args) {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        System.out.println("Before setting step size: " + spinnerModel.getStepSize());
        
        spinnerModel.setStepSize(5);
        System.out.println("After setting step size: " + spinnerModel.getStepSize());
    }
}
