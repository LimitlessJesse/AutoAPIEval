import javax.print.attribute.standard.JobMessageFromOperator;

public class JobMessageFromOperator_3 {
    public static void main(String[] args) {
        JobMessageFromOperator attribute1 = new JobMessageFromOperator("Message 1");
        JobMessageFromOperator attribute2 = new JobMessageFromOperator("Message 2");

        System.out.println("Are attribute1 and attribute2 equal? " + attribute1.equals(attribute2));
    }
}
