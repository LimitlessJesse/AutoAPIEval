import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_1 {
    public static void main(String[] args) {
        DefaultButtonModel buttonModel = new DefaultButtonModel();
        buttonModel.setArmed(true);
        System.out.println("Button is armed: " + buttonModel.isArmed());
    }
}
