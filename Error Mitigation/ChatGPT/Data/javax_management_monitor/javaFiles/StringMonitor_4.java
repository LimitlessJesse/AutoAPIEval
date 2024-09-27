import javax.management.monitor.StringMonitor;

public class StringMonitor_4 {
    public static void main(String[] args) {
        StringMonitor stringMonitor = new StringMonitor();
        boolean notifyMatch = stringMonitor.getNotifyMatch();
        System.out.println("Notify Match: " + notifyMatch);
    }
}
