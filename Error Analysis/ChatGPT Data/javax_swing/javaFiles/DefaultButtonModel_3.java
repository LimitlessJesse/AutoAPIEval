import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_3 {
    public static void main(String[] args) {
        DefaultButtonModel model = new DefaultButtonModel();
        model.setRollover(true);
        System.out.println("Rollover state set to: " + model.getRollover());
    }
}
