import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobKOctetsProcessed;

public class JobKOctetsProcessed_5 {
    public static void main(String[] args) {
        JobKOctetsProcessed jobKOctetsProcessed = new JobKOctetsProcessed();
        Class<? extends Attribute> category = jobKOctetsProcessed.getCategory();
        System.out.println(category);
    }
}
