import javax.print.attribute.standard.JobMediaSheetsCompleted;

public class JobMediaSheetsCompleted_3 {
    public static void main(String[] args) {
        JobMediaSheetsCompleted attr1 = new JobMediaSheetsCompleted(10);
        JobMediaSheetsCompleted attr2 = new JobMediaSheetsCompleted(10);
        
        System.out.println(attr1.equals(attr2)); // Output: true
    }
}
