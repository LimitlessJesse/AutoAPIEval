import java.awt.PrintJob;

public class PrintJob_3 {
    public static void main(String[] args) {
        PrintJob printJob = new PrintJob(); // Instantiate a PrintJob object
        int resolution = printJob.getPageResolution(); // Call the getPageResolution method
        System.out.println("Page resolution: " + resolution);
    }
}
