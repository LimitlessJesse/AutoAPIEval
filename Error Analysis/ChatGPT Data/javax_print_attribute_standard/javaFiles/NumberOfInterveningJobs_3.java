import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_3 {
    public static void main(String[] args) {
        NumberOfInterveningJobs numberOfInterveningJobs = new NumberOfInterveningJobs(5);
        String name = numberOfInterveningJobs.getName();
        System.out.println("Attribute name: " + name);
    }
}
