import java.awt.print.PrinterJob;
import java.awt.print.PrintService;

public class PrinterJob_4 {
    public static void main(String[] args) {
        PrintService[] services = PrinterJob.getPrintServices();
        for (PrintService service : services) {
            System.out.println(service.getDescription());
        }
    }
}
