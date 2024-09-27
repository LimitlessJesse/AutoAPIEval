import javax.print.attribute.standard.JobState;

public class JobState_3 {
    public static void main(String[] args) {
        JobState jobState = JobState.UNKNOWN;
        String categoryName = jobState.getName();
        System.out.println("Category name: " + categoryName);
    }
}
