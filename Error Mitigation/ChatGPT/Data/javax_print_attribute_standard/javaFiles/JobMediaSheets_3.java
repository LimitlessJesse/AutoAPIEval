import javax.print.attribute.standard.JobMediaSheets;

public class JobMediaSheets_3 {
    public static void main(String[] args) {
        JobMediaSheets jobMediaSheets1 = new JobMediaSheets(10);
        JobMediaSheets jobMediaSheets2 = new JobMediaSheets(10);
        
        System.out.println(jobMediaSheets1.equals(jobMediaSheets2)); // Output: true
    }
}
