import java.awt.Toolkit;
import java.awt.EventQueue;

public class Toolkit_5 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        EventQueue eventQueue = toolkit.getSystemEventQueue();
        System.out.println("System EventQueue: " + eventQueue);
    }
}
