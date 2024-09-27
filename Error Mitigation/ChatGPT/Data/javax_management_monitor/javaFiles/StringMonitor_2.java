import javax.management.monitor.StringMonitor;

public class StringMonitor_2 {
    public static void main(String[] args) {
        StringMonitor monitor = new StringMonitor();
        String stringToCompare = monitor.getStringToCompare();
        System.out.println("String to compare: " + stringToCompare);
    }
}
