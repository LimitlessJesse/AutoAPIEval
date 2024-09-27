import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_1 {
    public static void main(String[] args) {
        DefaultButtonModel buttonModel = new DefaultButtonModel();
        buttonModel.setPressed(true);
        System.out.println("Button is pressed: " + buttonModel.isPressed());
    }
}
