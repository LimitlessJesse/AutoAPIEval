import javax.print.attribute.standard.JobSheets;

public class JobSheets_3 {
    public static void main(String[] args) {
        JobSheets jobSheets = JobSheets.STANDARD;
        String categoryName = jobSheets.getName();
        System.out.println("Category name: " + categoryName);
    }
}
