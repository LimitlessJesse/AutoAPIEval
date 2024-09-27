import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_2 {
    public static void main(String[] args) {
        NumberOfInterveningJobs attribute1 = new NumberOfInterveningJobs(5);
        NumberOfInterveningJobs attribute2 = new NumberOfInterveningJobs(5);
        
        System.out.println(attribute1.equals(attribute2)); // Output: true
    }
}
