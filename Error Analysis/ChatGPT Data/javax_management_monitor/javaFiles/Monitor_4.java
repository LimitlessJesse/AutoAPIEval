import javax.management.monitor.Monitor;

public class Monitor_4 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        String observedAttribute = monitor.getObservedAttribute();
        System.out.println("Observed Attribute: " + observedAttribute);
    }
}
