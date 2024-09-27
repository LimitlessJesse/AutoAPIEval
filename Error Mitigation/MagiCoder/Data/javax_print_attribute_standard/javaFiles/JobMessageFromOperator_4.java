import javax.print.attribute.standard.JobMessageFromOperator;

public class JobMessageFromOperator_4 {
    public static void main(String[] args) {
        JobMessageFromOperator jobMessage1 = new JobMessageFromOperator("Message 1", null);
        JobMessageFromOperator jobMessage2 = new JobMessageFromOperator("Message 2", null);
        JobMessageFromOperator jobMessage3 = new JobMessageFromOperator("Message 1", null);

        System.out.println(jobMessage1.equals(jobMessage2)); // false
        System.out.println(jobMessage1.equals(jobMessage3)); // true
    }
}
