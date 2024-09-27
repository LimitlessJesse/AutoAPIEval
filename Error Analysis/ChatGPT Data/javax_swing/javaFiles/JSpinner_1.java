import javax.swing.JSpinner;

public class JSpinner_1 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        spinner.setValue(5);
        System.out.println(spinner.getValue());
    }
}
