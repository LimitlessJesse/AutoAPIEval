import java.awt.Dialog;

public class Dialog_3 {
    public static void main(String[] args) {
        Dialog dialog = new Dialog(null, "Example Dialog");
        dialog.setModal(true); // Set the dialog to be modal
        dialog.setVisible(true);
    }
}
