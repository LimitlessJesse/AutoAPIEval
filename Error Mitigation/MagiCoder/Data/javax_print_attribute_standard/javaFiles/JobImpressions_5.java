import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobImpressions;

public class JobImpressions_5 {
    public static void main(String[] args) {
        JobImpressions jobImpressions = new JobImpressions();
        Class<? extends Attribute> category = jobImpressions.getCategory();
        System.out.println(category);
    }
}
