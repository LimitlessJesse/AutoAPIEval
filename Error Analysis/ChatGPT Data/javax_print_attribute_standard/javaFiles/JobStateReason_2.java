import javax.print.attribute.standard.JobStateReason;

public class JobStateReason_2 {
    public static void main(String[] args) {
        // Create a JobStateReason object
        JobStateReason jobStateReason = JobStateReason.JOB_COMPLETED_SUCCESSFULLY;

        // Get the name of the JobStateReason
        String name = jobStateReason.getName();

        // Print the name
        System.out.println("Job State Reason Name: " + name);
    }
}
