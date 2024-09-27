import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobImpressionsCompleted;

public class JobImpressionsCompleted_2 {
    public static void main(String[] args) {
        JobImpressionsCompleted jobImpressionsCompleted = new JobImpressionsCompleted(10);
        Class<? extends Attribute> category = jobImpressionsCompleted.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
