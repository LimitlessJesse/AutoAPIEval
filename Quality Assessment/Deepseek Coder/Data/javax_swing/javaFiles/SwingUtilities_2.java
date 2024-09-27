import javax.swing.SwingUtilities;

public class SwingUtilities_2 {
    public static void main(String[] args) {
        boolean isEventDispatchThread = SwingUtilities.isEventDispatchThread();
        System.out.println("Is Event Dispatch Thread: " + isEventDispatchThread);
    }
}
