import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_3 {
    public static void main(String[] args) {
        DefaultButtonModel buttonModel = new DefaultButtonModel();
        buttonModel.setRollover(true);
        System.out.println("Button is in rollover state: " + buttonModel.isRollover());
    }
}
