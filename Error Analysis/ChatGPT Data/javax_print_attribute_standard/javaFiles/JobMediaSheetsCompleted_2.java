import javax.print.attribute.standard.JobMediaSheetsCompleted;
import javax.print.attribute.Attribute;

public class JobMediaSheetsCompleted_2 {
    public static void main(String[] args) {
        Class<? extends Attribute> category = JobMediaSheetsCompleted.class.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
