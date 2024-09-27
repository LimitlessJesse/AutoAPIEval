import java.awt.*;

public class PrintJob_4 {
    public static void main(String[] args) {
        // Create a new PrintJob object
        PrintJob printJob = Toolkit.getDefaultToolkit().getPrintJob(null, "Print Job", null);

        // Perform printing tasks

        // End the print job and do necessary cleanup
        printJob.end();
    }
}
