import javax.swing.JSpinner;

public class JSpinner_1 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        Object value = spinner.getValue();
        System.out.println("Current value: " + value);
    }
}
