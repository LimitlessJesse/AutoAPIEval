import javax.swing.SwingUtilities;

public class SwingUtilities_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("This is executed on the Event Dispatch Thread");
            }
        });
    }
}
