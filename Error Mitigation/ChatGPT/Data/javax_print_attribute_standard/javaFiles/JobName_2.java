import javax.print.attribute.standard.JobName;

public class JobName_2 {
    public static void main(String[] args) {
        JobName jobName1 = new JobName("PrintJob1", null);
        JobName jobName2 = new JobName("PrintJob1", null);
        
        boolean isEqual = jobName1.equals(jobName2);
        System.out.println("Are the job names equal? " + isEqual);
    }
}
