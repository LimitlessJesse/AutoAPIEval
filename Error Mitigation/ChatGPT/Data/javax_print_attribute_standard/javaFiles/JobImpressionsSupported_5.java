import javax.print.attribute.standard.JobImpressionsSupported;

public class JobImpressionsSupported_5 {
    public static void main(String[] args) {
        JobImpressionsSupported attribute1 = new JobImpressionsSupported(new int[]{1, 2, 3});
        JobImpressionsSupported attribute2 = new JobImpressionsSupported(new int[]{1, 2, 3});

        System.out.println("Are attribute1 and attribute2 equal? " + attribute1.equals(attribute2));
    }
}
