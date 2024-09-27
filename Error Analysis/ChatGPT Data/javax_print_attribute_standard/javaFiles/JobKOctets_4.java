import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_4 {
    public static void main(String[] args) {
        JobKOctets jobKOctets = new JobKOctets(1000);
        String attributeName = jobKOctets.getName();
        System.out.println("Attribute Name: " + attributeName);
    }
}
