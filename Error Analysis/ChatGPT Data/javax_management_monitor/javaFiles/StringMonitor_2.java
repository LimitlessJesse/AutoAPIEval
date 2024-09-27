import javax.management.ObjectName;
import javax.management.monitor.StringMonitor;

public class StringMonitor_2 {
    public static void main(String[] args) {
        StringMonitor monitor = new StringMonitor();
        ObjectName objectName = new ObjectName("test:name=stringMonitor");
        monitor.getDerivedGauge(objectName);
    }
}
