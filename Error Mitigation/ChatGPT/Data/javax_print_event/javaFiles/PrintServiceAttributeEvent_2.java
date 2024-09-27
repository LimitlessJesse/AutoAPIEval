import javax.print.event.PrintServiceAttributeEvent;
import javax.print.PrintService;

public class PrintServiceAttributeEvent_2 {
    public static void main(String[] args) {
        PrintServiceAttributeEvent event = new PrintServiceAttributeEvent(new PrintService() {
            @Override
            public String getName() {
                return "Printer";
            }
        });
        
        PrintService printService = event.getPrintService();
        System.out.println("Print Service: " + printService.getName());
    }
}
