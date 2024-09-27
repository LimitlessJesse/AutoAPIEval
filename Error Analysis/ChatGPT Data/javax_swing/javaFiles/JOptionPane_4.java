import javax.swing.JOptionPane;

public class JOptionPane_4 {
    public static void main(String[] args) {
        Object[] options = {"Yes", "No", "Cancel"};
        int result = JOptionPane.showOptionDialog(null, "Do you want to proceed?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println("Selected option: " + options[result]);
    }
}
