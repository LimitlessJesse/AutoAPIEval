import java.awt.Dialog;

public class Dialog_2 {
    public static void main(String[] args) {
        Dialog dialog = new Dialog(null, "Resizable Dialog", false);
        dialog.setSize(300, 200);
        dialog.setResizable(false); // Sets the dialog to not resizable
        dialog.setVisible(true);
    }
}
