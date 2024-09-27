import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobMediaSheets;

public class JobMediaSheets_5 {
    public static void main(String[] args) {
        JobMediaSheets jobMediaSheets = new JobMediaSheets();
        Class<? extends Attribute> category = jobMediaSheets.getCategory();
        System.out.println(category);
    }
}
