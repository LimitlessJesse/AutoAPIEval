import javax.swing.JOptionPane;

public class JOptionPane_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (option == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
        } else if (option == JOptionPane.NO_OPTION) {
            System.out.println("User clicked No");
        } else if (option == JOptionPane.CANCEL_OPTION) {
            System.out.println("User clicked Cancel");
        } else if (option == JOptionPane.CLOSED_OPTION) {
            System.out.println("User closed the dialog without selecting an option");
        }
    }
}
