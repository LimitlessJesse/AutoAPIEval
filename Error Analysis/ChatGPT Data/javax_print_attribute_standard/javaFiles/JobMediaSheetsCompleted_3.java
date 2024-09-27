import javax.print.attribute.standard.JobMediaSheetsCompleted;

public class JobMediaSheetsCompleted_3 {
    public static void main(String[] args) {
        JobMediaSheetsCompleted jobMediaSheetsCompleted = new JobMediaSheetsCompleted(5);
        String name = jobMediaSheetsCompleted.getName();
        System.out.println("Name of Job Media Sheets Completed attribute: " + name);
    }
}
