import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_2 {
    public static void main(String[] args) {
        DefaultButtonModel buttonModel = new DefaultButtonModel();
        buttonModel.setPressed(true);
        System.out.println("Is button pressed: " + buttonModel.isPressed());
    }
}
