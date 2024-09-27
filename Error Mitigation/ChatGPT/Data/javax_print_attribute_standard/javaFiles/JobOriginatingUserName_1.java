import javax.print.attribute.standard.JobOriginatingUserName;

public class JobOriginatingUserName_1 {
    public static void main(String[] args) {
        JobOriginatingUserName jobOriginatingUserName = new JobOriginatingUserName("John Doe");
        String categoryName = jobOriginatingUserName.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
