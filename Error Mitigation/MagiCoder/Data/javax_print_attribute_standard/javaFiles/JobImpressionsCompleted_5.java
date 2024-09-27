import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobImpressionsCompleted;

public class JobImpressionsCompleted_5 {
    public static void main(String[] args) {
        JobImpressionsCompleted jobImpressionsCompleted = new JobImpressionsCompleted();
        Class<? extends Attribute> category = jobImpressionsCompleted.getCategory();
        System.out.println(category);
    }
}
