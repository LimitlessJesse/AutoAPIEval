import javax.print.attribute.standard.JobStateReason;

public class JobStateReason_2 {
    public static void main(String[] args) {
        JobStateReason jobStateReason = JobStateReason.JOB_COMPLETED_SUCCESSFULLY;
        String categoryName = jobStateReason.getName();
        System.out.println("Category name: " + categoryName);
    }
}
