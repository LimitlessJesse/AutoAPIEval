import javax.print.attribute.standard.JobKOctetsSupported;

public class JobKOctetsSupported_2 {
    public static void main(String[] args) {
        JobKOctetsSupported job1 = new JobKOctetsSupported(100);
        JobKOctetsSupported job2 = new JobKOctetsSupported(100);

        boolean isEqual = job1.equals(job2);

        System.out.println("Are job1 and job2 equal? " + isEqual);
    }
}
