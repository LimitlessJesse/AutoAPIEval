import javax.management.monitor.StringMonitor;

public class StringMonitor_1 {
    public static void main(String[] args) {
        StringMonitor monitor = new StringMonitor();
        try {
            monitor.setStringToCompare("example");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
