import javax.swing.SwingUtilities;

public class SwingUtilities_1 {
    public static void main(String[] args) {
        // Define a Runnable object
        Runnable doHelloWorld = new Runnable() {
            public void run() {
                System.out.println("Hello World on " + Thread.currentThread());
            }
        };

        // Call invokeLater to execute the Runnable asynchronously on the AWT event dispatching thread
        SwingUtilities.invokeLater(doHelloWorld);

        System.out.println("This might well be displayed before the other message.");
    }
}
