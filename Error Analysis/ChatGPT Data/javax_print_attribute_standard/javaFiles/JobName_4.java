import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobName;

public class JobName_4 {
    public static void main(String[] args) {
        JobName jobName = new JobName("PrintJob", null);
        Class<? extends Attribute> category = jobName.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
