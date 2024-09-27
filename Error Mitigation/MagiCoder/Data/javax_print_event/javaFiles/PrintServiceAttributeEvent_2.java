import javax.print.PrintService;
import javax.print.event.PrintServiceAttributeEvent;

public class PrintServiceAttributeEvent_2 {
    public static void main(String[] args) {
        // Create a PrintService object
        PrintService printService = new PrintService();

        // Create a PrintServiceAttributeEvent object
        PrintServiceAttributeEvent event = new PrintServiceAttributeEvent(printService);

        // Get the PrintService from the event
        PrintService service = event.getPrintService();

        // Print the service
        System.out.println(service);
    }
}
