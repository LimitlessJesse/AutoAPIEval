import javax.print.attribute.standard.JobMessageFromOperator;

public class JobMessageFromOperator_4 {
    public static void main(String[] args) {
        JobMessageFromOperator jobMessage1 = new JobMessageFromOperator("Message 1");
        JobMessageFromOperator jobMessage2 = new JobMessageFromOperator("Message 2");

        boolean result1 = jobMessage1.equals(jobMessage2);
        boolean result2 = jobMessage1.equals(new JobMessageFromOperator("Message 1"));

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
