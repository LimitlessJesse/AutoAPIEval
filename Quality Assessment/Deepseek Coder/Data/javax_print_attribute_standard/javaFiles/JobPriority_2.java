public enum JobPriority {
    HIGH,
    MEDIUM,
    LOW
}

public class JobPriority_2 {
    public static void main(String[] args) {
        JobPriority jobPriority = JobPriority.HIGH;
        System.out.println(jobPriority.name());
    }
}
