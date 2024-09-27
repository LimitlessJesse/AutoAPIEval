import javax.print.attribute.standard.JobHoldUntil;
import java.util.Date;

public class JobHoldUntil_3 {
    public static void main(String[] args) {
        Date date1 = new Date();
        JobHoldUntil jobHoldUntil1 = new JobHoldUntil(date1);

        Date date2 = new Date();
        JobHoldUntil jobHoldUntil2 = new JobHoldUntil(date2);

        System.out.println(jobHoldUntil1.equals(jobHoldUntil2));
    }
}
