import javax.print.attribute.standard.JobImpressionsCompleted;

public class JobImpressionsCompleted_2 {
    public static void main(String[] args) {
        JobImpressionsCompleted job1 = new JobImpressionsCompleted(10);
        JobImpressionsCompleted job2 = new JobImpressionsCompleted(10);
        JobImpressionsCompleted job3 = new JobImpressionsCompleted(20);

        System.out.println(job1.equals(job2)); // true
        System.out.println(job1.equals(job3)); // false
    }
}
