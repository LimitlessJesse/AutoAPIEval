import javax.swing.JOptionPane;

public class JOptionPane_1 {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to proceed?");
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("User clicked No");
        } else {
            System.out.println("User clicked Cancel");
        }
    }
}
