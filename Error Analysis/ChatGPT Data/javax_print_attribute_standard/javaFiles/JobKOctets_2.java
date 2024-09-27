import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_2 {
    public static void main(String[] args) {
        JobKOctets jobKOctets1 = new JobKOctets(1000);
        JobKOctets jobKOctets2 = new JobKOctets(2000);
        
        boolean isEqual = jobKOctets1.equals(jobKOctets2);
        System.out.println("Are jobKOctets1 and jobKOctets2 equal? " + isEqual);
    }
}
