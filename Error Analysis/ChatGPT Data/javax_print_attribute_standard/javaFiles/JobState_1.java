import javax.print.attribute.standard.JobState;
import javax.print.attribute.Attribute;

public class JobState_1 {
    public static void main(String[] args) {
        JobState jobState = JobState.CREATED;
        Class<? extends Attribute> category = jobState.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
