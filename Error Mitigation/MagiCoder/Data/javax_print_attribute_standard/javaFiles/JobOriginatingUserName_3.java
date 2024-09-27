import javax.print.attribute.standard.JobOriginatingUserName;

public class JobOriginatingUserName_3 {
    public static void main(String[] args) {
        JobOriginatingUserName jobOriginatingUserName1 = new JobOriginatingUserName("user1", null);
        JobOriginatingUserName jobOriginatingUserName2 = new JobOriginatingUserName("user2", null);

        System.out.println(jobOriginatingUserName1.equals(jobOriginatingUserName2));
    }
}
