import javax.print.attribute.standard.JobKOctetsSupported;

public class JobKOctetsSupported_2 {
    public static void main(String[] args) {
        JobKOctetsSupported jobKOctetsSupported1 = new JobKOctetsSupported(1, 2, 3);
        JobKOctetsSupported jobKOctetsSupported2 = new JobKOctetsSupported(1, 2, 3);
        JobKOctetsSupported jobKOctetsSupported3 = new JobKOctetsSupported(4, 5, 6);

        System.out.println(jobKOctetsSupported1.equals(jobKOctetsSupported2)); // true
        System.out.println(jobKOctetsSupported1.equals(jobKOctetsSupported3)); // false
    }
}
