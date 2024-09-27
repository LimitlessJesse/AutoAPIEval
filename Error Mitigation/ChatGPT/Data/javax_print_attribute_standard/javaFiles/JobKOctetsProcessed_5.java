import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.print.attribute.Attribute;

public class JobKOctetsProcessed_5 {
    public static void main(String[] args) {
        JobKOctetsProcessed jobKOctetsProcessed = new JobKOctetsProcessed(1000);
        Class<? extends Attribute> category = jobKOctetsProcessed.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
