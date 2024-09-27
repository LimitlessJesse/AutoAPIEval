import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_2 {
    public static void main(String[] args) {
        DefaultButtonModel model = new DefaultButtonModel();
        model.setArmed(true);

        System.out.println("Is model armed: " + model.isArmed());
    }
}
