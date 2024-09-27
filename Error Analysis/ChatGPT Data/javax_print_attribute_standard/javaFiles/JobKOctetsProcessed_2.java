import javax.print.attribute.standard.JobKOctetsProcessed;

public class JobKOctetsProcessed_2 {
    public static void main(String[] args) {
        JobKOctetsProcessed jobKOctetsProcessed1 = new JobKOctetsProcessed(1000);
        JobKOctetsProcessed jobKOctetsProcessed2 = new JobKOctetsProcessed(2000);
        
        boolean isEqual = jobKOctetsProcessed1.equals(jobKOctetsProcessed2);
        System.out.println("Are the JobKOctetsProcessed objects equal? " + isEqual);
    }
}
