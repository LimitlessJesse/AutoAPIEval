import javax.swing.SwingUtilities;

public class SwingUtilities_2 {
    public static void main(String[] args) {
        Runnable doRun = new Runnable() {
            @Override
            public void run() {
                // Place code here that needs to be executed on the Event Dispatch Thread
                System.out.println("Hello from Event Dispatch Thread");
            }
        };

        SwingUtilities.invokeLater(doRun);
    }
}
