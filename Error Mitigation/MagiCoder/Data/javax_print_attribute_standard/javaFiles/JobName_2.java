import javax.print.attribute.standard.JobName;

public class JobName_2 {
    public static void main(String[] args) {
        JobName jobName = new JobName("MyJob", "en");
        String name = jobName.getName();
        System.out.println(name);
    }
}
