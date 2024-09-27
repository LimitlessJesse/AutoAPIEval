import java.awt.PrintJob;
import java.awt.Graphics;

public class PrintJob_4 {
    public static void main(String[] args) {
        // Create a new print job
        PrintJob printJob = null;
        
        // Initialize the print job with a title
        if (printJob != null) {
            printJob = printJob.getToolkit().getPrintJob(null, "Title", null);
            
            // Print some graphics
            Graphics graphics = printJob.getGraphics();
            graphics.drawString("Hello, world!", 100, 100);
            
            // End the print job
            printJob.end();
        } else {
            System.out.println("Print job was not initialized.");
        }
    }
}
