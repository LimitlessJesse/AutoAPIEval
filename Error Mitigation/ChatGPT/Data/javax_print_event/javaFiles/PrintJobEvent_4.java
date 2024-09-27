import javax.print.event.PrintJobEvent;

public class PrintJobEvent_4 {
    public static void main(String[] args) {
        PrintJobEvent event = new PrintJobEvent();
        int eventType = event.getPrintEventType();
        System.out.println("Print event type: " + eventType);
    }
}
