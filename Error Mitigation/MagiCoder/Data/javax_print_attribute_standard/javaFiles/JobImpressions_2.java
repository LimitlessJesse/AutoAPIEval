import javax.print.attribute.standard.JobImpressions;

public class JobImpressions_2 {
    public static void main(String[] args) {
        JobImpressions jobImpressions1 = new JobImpressions(10);
        JobImpressions jobImpressions2 = new JobImpressions(10);
        JobImpressions jobImpressions3 = new JobImpressions(20);

        System.out.println(jobImpressions1.equals(jobImpressions2)); // true
        System.out.println(jobImpressions1.equals(jobImpressions3)); // false
    }
}
