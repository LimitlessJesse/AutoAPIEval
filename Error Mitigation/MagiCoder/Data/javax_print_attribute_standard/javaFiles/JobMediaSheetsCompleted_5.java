import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobMediaSheetsCompleted;

public class JobMediaSheetsCompleted_5 {
    public static void main(String[] args) {
        JobMediaSheetsCompleted jobMediaSheetsCompleted = new JobMediaSheetsCompleted();
        Class<? extends Attribute> category = jobMediaSheetsCompleted.getCategory();
        System.out.println(category);
    }
}
