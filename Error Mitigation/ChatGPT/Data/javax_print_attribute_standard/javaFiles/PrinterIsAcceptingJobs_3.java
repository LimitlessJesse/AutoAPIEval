import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class PrinterIsAcceptingJobs_3 {
    public static void main(String[] args) {
        PrinterIsAcceptingJobs attribute = PrinterIsAcceptingJobs.ACCEPTING;
        String categoryName = attribute.getName();
        System.out.println("Category name: " + categoryName);
    }
}
