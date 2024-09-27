import javax.print.attribute.standard.JobMediaSheetsCompleted;

public class JobMediaSheetsCompleted_2 {
    public static void main(String[] args) {
        JobMediaSheetsCompleted jobMediaSheetsCompleted1 = new JobMediaSheetsCompleted(5);
        JobMediaSheetsCompleted jobMediaSheetsCompleted2 = new JobMediaSheetsCompleted(5);
        JobMediaSheetsCompleted jobMediaSheetsCompleted3 = new JobMediaSheetsCompleted(10);

        System.out.println(jobMediaSheetsCompleted1.equals(jobMediaSheetsCompleted2)); // true
        System.out.println(jobMediaSheetsCompleted1.equals(jobMediaSheetsCompleted3)); // false
        System.out.println(jobMediaSheetsCompleted1.equals(null)); // false
        System.out.println(jobMediaSheetsCompleted1.equals("Hello")); // false
    }
}
