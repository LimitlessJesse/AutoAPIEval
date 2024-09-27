import javax.swing.SwingUtilities;

public class SwingUtilities_2 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Task executed on: " + Thread.currentThread().getName());
            }
        };

        try {
            SwingUtilities.invokeAndWait(task);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("SwingUtilities_2 thread executed on: " + Thread.currentThread().getName());
    }
}
