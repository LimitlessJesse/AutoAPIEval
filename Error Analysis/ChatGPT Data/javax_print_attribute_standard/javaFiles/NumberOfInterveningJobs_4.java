import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_4 {
    public static void main(String[] args) {
        NumberOfInterveningJobs numJobs = new NumberOfInterveningJobs(5);
        NumberOfInterveningJobs otherNumJobs = new NumberOfInterveningJobs(5);
        
        boolean isEqual = numJobs.equals(otherNumJobs);
        
        System.out.println("Are the NumberOfInterveningJobs equal? " + isEqual);
    }
}
