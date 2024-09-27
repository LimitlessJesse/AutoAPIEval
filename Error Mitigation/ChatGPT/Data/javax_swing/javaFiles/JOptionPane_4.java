import javax.swing.JOptionPane;

public class JOptionPane_4 {
    public static void main(String[] args) {
        Object[] options = {"Option 1", "Option 2", "Option 3"};
        int result = JOptionPane.showOptionDialog(null, "Select an option", "Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println("Option selected: " + result);
    }
}
