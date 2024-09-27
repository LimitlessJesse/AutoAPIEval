import javax.print.attribute.standard.JobKOctetsSupported;

public class JobKOctetsSupported_4 {
    public static void main(String[] args) {
        JobKOctetsSupported jobKOctetsSupported = new JobKOctetsSupported(1024, 2048, 4096);
        System.out.println("Supported values: " + jobKOctetsSupported.getName());
    }
}
