import javax.print.attribute.standard.QueuedJobCount;

public class QueuedJobCount_2 {
    public static void main(String[] args) {
        QueuedJobCount attribute1 = new QueuedJobCount(5);
        QueuedJobCount attribute2 = new QueuedJobCount(5);
        
        System.out.println(attribute1.equals(attribute2)); // Output: true
    }
}
