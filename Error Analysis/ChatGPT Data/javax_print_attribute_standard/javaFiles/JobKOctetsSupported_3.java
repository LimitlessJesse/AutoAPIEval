import javax.print.attribute.standard.JobKOctetsSupported;

public class JobKOctetsSupported_3 {
    public static void main(String[] args) {
        JobKOctetsSupported jobKOctetsSupported1 = new JobKOctetsSupported(10240, 20480);
        JobKOctetsSupported jobKOctetsSupported2 = new JobKOctetsSupported(10240, 20480);
        
        if(jobKOctetsSupported1.equals(jobKOctetsSupported2)){
            System.out.println("JobKOctetsSupported objects are equal");
        } else {
            System.out.println("JobKOctetsSupported objects are not equal");
        }
    }
}
