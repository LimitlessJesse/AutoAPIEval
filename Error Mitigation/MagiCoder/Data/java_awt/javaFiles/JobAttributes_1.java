import java.awt.print.JobAttributes;
import java.awt.print.PrinterException;

public class JobAttributes_1 {
    public static void main(String[] args) {
        JobAttributes jobAttributes = new JobAttributes();
        try {
            jobAttributes.setCopies(2);
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}
