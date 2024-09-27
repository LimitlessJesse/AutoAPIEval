import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class PrinterIsAcceptingJobs_4 {
    public static void main(String[] args) {
        PrinterIsAcceptingJobs printerIsAcceptingJobs = PrinterIsAcceptingJobs.ACCEPTING;
        Class<? extends Attribute> category = printerIsAcceptingJobs.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
