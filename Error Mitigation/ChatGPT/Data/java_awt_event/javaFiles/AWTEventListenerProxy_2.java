import java.awt.event.AWTEventListenerProxy;

public class AWTEventListenerProxy_2 {
    public static void main(String[] args) {
        AWTEventListenerProxy proxy = new AWTEventListenerProxy(0L);
        long eventMask = proxy.getEventMask();
        System.out.println("Event Mask: " + eventMask);
    }
}
