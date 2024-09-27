import javax.print.attribute.standard.JobOriginatingUserName;

public class JobOriginatingUserName_4 {
    public static void main(String[] args) {
        JobOriginatingUserName userName1 = new JobOriginatingUserName("Alice");
        JobOriginatingUserName userName2 = new JobOriginatingUserName("Alice");

        System.out.println(userName1.equals(userName2)); // Output: true
    }
}
