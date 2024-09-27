import javax.print.attribute.standard.JobPrioritySupported;

public class JobPrioritySupported_4 {
    public static void main(String[] args) {
        JobPrioritySupported priority1 = new JobPrioritySupported(1);
        JobPrioritySupported priority2 = new JobPrioritySupported(2);
        
        System.out.println("Are priorities equal? " + priority1.equals(priority2));
    }
}
