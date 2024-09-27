import java.awt.print.PrinterJob;

public class PrinterJob_4 {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setCopies(2);
        System.out.println("Number of copies set to: " + job.getCopies());
    }
}
