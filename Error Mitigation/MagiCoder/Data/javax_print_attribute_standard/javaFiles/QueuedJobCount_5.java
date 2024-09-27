import javax.print.attribute.Attribute;
import javax.print.attribute.standard.QueuedJobCount;

public class QueuedJobCount_5 {
    public static void main(String[] args) {
        QueuedJobCount queuedJobCount = new QueuedJobCount();
        Class<? extends Attribute> category = queuedJobCount.getCategory();
        System.out.println(category);
    }
}
