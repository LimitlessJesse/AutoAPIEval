import javax.swing.text.LayoutQueue;

public class LayoutQueue_1 {
    public static void main(String[] args) {
        LayoutQueue layoutQueue = new LayoutQueue();
        layoutQueue.addTask(() -> {
            // Task to be executed
            System.out.println("Task is executed");
        });
    }
}
