import javax.print.attribute.standard.NumberOfInterveningJobs;

public class NumberOfInterveningJobs_2 {
    public static void main(String[] args) {
        NumberOfInterveningJobs job1 = new NumberOfInterveningJobs(5);
        NumberOfInterveningJobs job2 = new NumberOfInterveningJobs(5);

        System.out.println(job1.equals(job2)); // Output: true
    }
}
