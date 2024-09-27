import javax.print.attribute.standard.JobKOctetsSupported;
import javax.print.attribute.Attribute;

public class JobKOctetsSupported_1 {
    public static void main(String[] args) {
        JobKOctetsSupported jobKOctetsSupported = new JobKOctetsSupported(1000, 5000);
        Class<? extends Attribute> category = jobKOctetsSupported.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
