import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_2 {
    public static void main(String[] args) {
        JobKOctets jobKOctets1 = new JobKOctets(1024);
        JobKOctets jobKOctets2 = new JobKOctets(2048);
        
        System.out.println("jobKOctets1 equals jobKOctets2: " + jobKOctets1.equals(jobKOctets2));
        System.out.println("jobKOctets1 equals jobKOctets1: " + jobKOctets1.equals(jobKOctets1));
    }
}
