import javax.print.attribute.standard.JobMessageFromOperator;
import javax.print.attribute.Attribute;

public class JobMessageFromOperator_2 {
    public static void main(String[] args) {
        JobMessageFromOperator jobMessage = new JobMessageFromOperator("Operator Message");
        Class<? extends Attribute> category = jobMessage.getCategory();
        System.out.println("Category of JobMessageFromOperator attribute: " + category.getName());
    }
}
