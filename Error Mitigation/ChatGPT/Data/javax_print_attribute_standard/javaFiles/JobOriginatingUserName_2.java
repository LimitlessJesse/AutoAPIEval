import javax.print.attribute.standard.JobOriginatingUserName;

public class JobOriginatingUserName_2 {
    public static void main(String[] args) {
        JobOriginatingUserName attribute1 = new JobOriginatingUserName("John Doe", java.util.Locale.US);
        JobOriginatingUserName attribute2 = new JobOriginatingUserName("Jane Smith", java.util.Locale.US);

        System.out.println("Are attribute1 and attribute2 equal? " + attribute1.equals(attribute2));
    }
}
