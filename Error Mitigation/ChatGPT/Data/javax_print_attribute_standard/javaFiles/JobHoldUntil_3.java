import javax.print.attribute.standard.JobHoldUntil;

public class JobHoldUntil_3 {
    public static void main(String[] args) {
        JobHoldUntil jobHoldUntil1 = new JobHoldUntil(new Date(2022, 10, 15, 12, 30));
        JobHoldUntil jobHoldUntil2 = new JobHoldUntil(new Date(2022, 10, 15, 12, 30));
        
        System.out.println(jobHoldUntil1.equals(jobHoldUntil2)); // Output: true
    }
}
