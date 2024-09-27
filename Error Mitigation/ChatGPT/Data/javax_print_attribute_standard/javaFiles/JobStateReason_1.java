import javax.print.attribute.standard.JobStateReason;

public class JobStateReason_1 {
    public static void main(String[] args) {
        JobStateReason jobStateReason = JobStateReason.JOB_COMPLETED_SUCCESSFULLY;
        Class<? extends Attribute> category = jobStateReason.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
