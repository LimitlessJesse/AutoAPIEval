import java.awt.JobAttributes;

public class JobAttributes_SidesType_5 {
    public static void main(String[] args) {
        JobAttributes.SidesType sidesType = JobAttributes.SidesType.DUPLEX;
        String sidesTypeString = sidesType.toString();
        System.out.println("SidesType: " + sidesTypeString);
    }
}
