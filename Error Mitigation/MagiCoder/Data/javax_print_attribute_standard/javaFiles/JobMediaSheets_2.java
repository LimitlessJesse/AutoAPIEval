import javax.print.attribute.standard.JobMediaSheets;

public class JobMediaSheets_2 {
    public static void main(String[] args) {
        JobMediaSheets jobMediaSheets1 = new JobMediaSheets(10);
        JobMediaSheets jobMediaSheets2 = new JobMediaSheets(10);
        JobMediaSheets jobMediaSheets3 = new JobMediaSheets(20);

        System.out.println(jobMediaSheets1.equals(jobMediaSheets2)); // true
        System.out.println(jobMediaSheets1.equals(jobMediaSheets3)); // false
    }
}
