import javax.management.monitor.Monitor;

public class Monitor_4 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        try {
            monitor.setObservedAttribute("attributeName");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
