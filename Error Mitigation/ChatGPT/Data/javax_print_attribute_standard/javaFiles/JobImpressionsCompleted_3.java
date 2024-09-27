import javax.print.attribute.standard.JobImpressionsCompleted;

public class JobImpressionsCompleted_3 {
    public static void main(String[] args) {
        JobImpressionsCompleted attribute1 = new JobImpressionsCompleted(5);
        JobImpressionsCompleted attribute2 = new JobImpressionsCompleted(5);

        boolean result1 = attribute1.equals(attribute2);
        System.out.println("Are attribute1 and attribute2 equivalent? " + result1);

        JobImpressionsCompleted attribute3 = new JobImpressionsCompleted(10);

        boolean result2 = attribute1.equals(attribute3);
        System.out.println("Are attribute1 and attribute3 equivalent? " + result2);
    }
}
