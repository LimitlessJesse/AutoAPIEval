import java.awt.print.Printable;
import java.awt.print.PrinterJob;

public class PrinterJob_1 {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        Printable printable = (graphics, pageFormat, pageIndex) -> {
            // Custom printing logic goes here
            return Printable.PAGE_EXISTS;
        };
        job.setPrintable(printable);
    }
}
