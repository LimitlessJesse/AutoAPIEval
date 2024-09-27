import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobPriority;

public class JobPriority_2 {
    public static void main(String[] args) {
        Class<? extends Attribute> category = JobPriority.getCategory();
        System.out.println("Job Priority category: " + category);
    }
}
