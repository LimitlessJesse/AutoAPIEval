import javax.print.attribute.standard.JobKOctetsProcessed;

public class JobKOctetsProcessed_2 {
    public static void main(String[] args) {
        JobKOctetsProcessed attribute1 = new JobKOctetsProcessed(1000);
        JobKOctetsProcessed attribute2 = new JobKOctetsProcessed(1000);
        
        System.out.println(attribute1.equals(attribute2)); // Output: true
    }
}
