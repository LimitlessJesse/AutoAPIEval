import javax.print.attribute.standard.JobImpressionsSupported;

public class JobImpressionsSupported_4 {
    public static void main(String[] args) {
        JobImpressionsSupported impressions1 = new JobImpressionsSupported(100, 200);
        JobImpressionsSupported impressions2 = new JobImpressionsSupported(50, 150);

        boolean isEqual = impressions1.equals(impressions2);
        System.out.println("Are the JobImpressionsSupported objects equal? " + isEqual);
    }
}
