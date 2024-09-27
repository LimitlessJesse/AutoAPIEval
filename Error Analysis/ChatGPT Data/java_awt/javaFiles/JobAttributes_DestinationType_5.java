import java.awt.JobAttributes;

public class JobAttributes_DestinationType_5 {
    public static void main(String[] args) {
        JobAttributes.DestinationType destinationType = JobAttributes.DestinationType.FILE;
        String destinationString = destinationType.toString();
        System.out.println(destinationString);
    }
}
