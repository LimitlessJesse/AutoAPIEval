import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import javax.print.attribute.Attribute;

public class PrinterIsAcceptingJobs_5 {
    public static void main(String[] args) {
        PrinterIsAcceptingJobs attribute = PrinterIsAcceptingJobs.IS_ACCEPTING_JOBS;
        Class<? extends Attribute> category = attribute.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
