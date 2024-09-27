import javax.print.attribute.standard.JobSheets;
import javax.print.attribute.Attribute;

public class JobSheets_5 {
    public static void main(String[] args) {
        JobSheets jobSheets = JobSheets.STANDARD;
        Class<? extends Attribute> category = jobSheets.getCategory();
        System.out.println(category);
    }
}
