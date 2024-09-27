import javax.print.attribute.standard.JobOriginatingUserName;

public class JobOriginatingUserName_2 {
    public static void main(String[] args) {
        JobOriginatingUserName jobOriginatingUserName = new JobOriginatingUserName();
        String categoryName = jobOriginatingUserName.getName();
        System.out.println("Category name: " + categoryName);
    }
}
