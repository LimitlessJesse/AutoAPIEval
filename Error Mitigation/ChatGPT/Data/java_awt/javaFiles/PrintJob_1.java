import java.awt.*;

public class PrintJob_1 {
    public static void main(String[] args) {
        PrintJob printJob = Toolkit.getDefaultToolkit().getPrintJob(null, "Print Job", null);
        Graphics graphics = printJob.getGraphics();
        
        // Draw on the graphics object
        graphics.setColor(Color.BLACK);
        graphics.drawString("Hello, World!", 100, 100);
        
        // Dispose the graphics object to send the page to the printer
        graphics.dispose();
        
        printJob.end();
    }
}
