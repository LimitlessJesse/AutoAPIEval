import javax.print.attribute.standard.QueuedJobCount;

public class QueuedJobCount_3 {
    public static void main(String[] args) {
        QueuedJobCount jobCount1 = new QueuedJobCount(5);
        QueuedJobCount jobCount2 = new QueuedJobCount(5);

        // Using equals method to compare QueuedJobCount objects
        boolean result = jobCount1.equals(jobCount2);
        System.out.println("Are the job counts equal? " + result);
    }
}
