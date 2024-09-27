import javax.print.attribute.standard.JobName;

public class JobName_1 {
    public static void main(String[] args) {
        JobName jobName = new JobName("PrintJob");
        String categoryName = jobName.getName();
        System.out.println("Category name: " + categoryName);
    }
}
