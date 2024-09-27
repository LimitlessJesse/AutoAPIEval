import java.awt.print.PrinterJob;

public class PrinterJob_5 {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        if (job.printDialog()) {
            try {
                job.print();
            } catch (Exception e) {
                System.out.println("Error printing: " + e.getMessage());
            }
        }
    }
}
