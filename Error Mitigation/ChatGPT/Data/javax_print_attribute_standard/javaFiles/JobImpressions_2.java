import javax.print.attribute.standard.JobImpressions;

public class JobImpressions_2 {
    public static void main(String[] args) {
        JobImpressions jobImpressions1 = new JobImpressions(100);
        JobImpressions jobImpressions2 = new JobImpressions(100);

        System.out.println("jobImpressions1 equals jobImpressions2: " + jobImpressions1.equals(jobImpressions2));
    }
}
