import javax.print.attribute.standard.JobState;

public class JobState_2 {
    public static void main(String[] args) {
        JobState jobState = JobState.PENDING;
        String stateName = jobState.getName();
        System.out.println("Job state name: " + stateName);
    }
}
