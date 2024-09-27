import javax.print.attribute.standard.QueuedJobCount;

public class QueuedJobCount_2 {
    public static void main(String[] args) {
        QueuedJobCount qjc1 = new QueuedJobCount(5);
        QueuedJobCount qjc2 = new QueuedJobCount(5);
        QueuedJobCount qjc3 = new QueuedJobCount(10);

        System.out.println(qjc1.equals(qjc2)); // true
        System.out.println(qjc1.equals(qjc3)); // false
    }
}
