import javax.print.attribute.Attribute;
import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_5 {
    public static void main(String[] args) {
        NumberOfInterveningJobs numberOfInterveningJobs = new NumberOfInterveningJobs();
        Class<? extends Attribute> category = numberOfInterveningJobs.getCategory();
        System.out.println(category);
    }
}
