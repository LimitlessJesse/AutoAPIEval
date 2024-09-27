import java.awt.print.JobAttributes;

public class JobAttributes_2 {
    public static void main(String[] args) {
        JobAttributes jobAttributes = new JobAttributes();
        int copies = jobAttributes.getCopies();
        System.out.println("Number of copies: " + copies);
    }
}
