import javax.print.attribute.standard.JobName;

public class JobName_5 {
    public static void main(String[] args) {
        JobName jobName1 = new JobName("Job1", null);
        JobName jobName2 = new JobName("Job1", null);

        boolean isEqual = jobName1.equals(jobName2);

        System.out.println("Are jobName1 and jobName2 equal? " + isEqual);
    }
}
