import java.awt.*;

public class PrintJob_1 {
    public static void main(String[] args) {
        PrintJob printJob = Toolkit.getDefaultToolkit().getPrintJob(null, "Print Job", null);
        Graphics graphics = printJob.getGraphics();
        graphics.drawString("Hello, this is a test print", 100, 100);
        printJob.end();
    }
}
