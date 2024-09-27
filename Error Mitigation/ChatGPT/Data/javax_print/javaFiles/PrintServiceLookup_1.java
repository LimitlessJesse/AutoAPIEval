import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class PrintServiceLookup_1 {
    public static void main(String[] args) {
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
        System.out.println("Default Print Service: " + defaultPrintService);
    }
}
