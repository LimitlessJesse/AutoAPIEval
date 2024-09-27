import javax.print.attribute.standard.QueuedJobCount;
import javax.print.attribute.Attribute;

public class QueuedJobCount_5 {
    public static void main(String[] args) {
        QueuedJobCount queuedJobCount = new QueuedJobCount(5);
        Class<? extends Attribute> category = queuedJobCount.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
