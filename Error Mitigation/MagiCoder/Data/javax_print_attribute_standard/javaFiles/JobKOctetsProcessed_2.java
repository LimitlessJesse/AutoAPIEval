import javax.print.attribute.standard.JobKOctetsProcessed;

public class JobKOctetsProcessed_2 {
    public static void main(String[] args) {
        JobKOctetsProcessed jobKOctetsProcessed1 = new JobKOctetsProcessed(1024);
        JobKOctetsProcessed jobKOctetsProcessed2 = new JobKOctetsProcessed(1024);

        System.out.println(jobKOctetsProcessed1.equals(jobKOctetsProcessed2)); // Output: true
    }
}
