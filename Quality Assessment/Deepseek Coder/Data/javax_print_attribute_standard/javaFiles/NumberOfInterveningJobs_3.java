import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_3 {
    public static void main(String[] args) {
        NumberOfInterveningJobs attr1 = new NumberOfInterveningJobs(5);
        NumberOfInterveningJobs attr2 = new NumberOfInterveningJobs(5);

        boolean isEqual = attr1.equals(attr2);

        System.out.println("Is equal: " + isEqual);
    }
}
