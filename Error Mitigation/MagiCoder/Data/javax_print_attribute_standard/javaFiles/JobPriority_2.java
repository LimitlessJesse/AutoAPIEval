import javax.print.attribute.standard.JobPriority;

public class JobPriority_2 {
    public static void main(String[] args) {
        JobPriority jobPriority1 = new JobPriority(1);
        JobPriority jobPriority2 = new JobPriority(2);
        JobPriority jobPriority3 = new JobPriority(1);

        System.out.println(jobPriority1.equals(jobPriority2)); // false
        System.out.println(jobPriority1.equals(jobPriority3)); // true
    }
}
