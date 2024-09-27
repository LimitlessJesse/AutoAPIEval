import javax.print.attribute.standard.JobMediaSheetsCompleted;

public class JobMediaSheetsCompleted_2 {
    public static void main(String[] args) {
        JobMediaSheetsCompleted job1 = new JobMediaSheetsCompleted(1);
        JobMediaSheetsCompleted job2 = new JobMediaSheetsCompleted(1);

        boolean isEqual = job1.equals(job2);

        System.out.println("Are job1 and job2 equal? " + isEqual);
    }
}
