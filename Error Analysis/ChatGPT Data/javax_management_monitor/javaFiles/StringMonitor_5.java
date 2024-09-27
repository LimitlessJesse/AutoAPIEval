import javax.management.monitor.StringMonitor;

public class StringMonitor_5 {
    public static void main(String[] args) {
        StringMonitor monitor = new StringMonitor();
        monitor.setStringToCompare("example");
        System.out.println("String to compare: " + monitor.getStringToCompare());
    }
}
