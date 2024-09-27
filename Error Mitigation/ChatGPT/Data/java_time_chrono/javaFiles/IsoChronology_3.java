import java.time.chrono.Era;
import java.time.chrono.IsoChronology;

public class IsoChronology_3 {
    public static void main(String[] args) {
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        Era era = isoChronology.eraOf(1); // Assuming era value 1 for example
        int yearOfEra = 2022; // Assuming year value 2022 for example
        int prolepticYear = isoChronology.prolepticYear(era, yearOfEra);
        System.out.println("Proleptic Year: " + prolepticYear);
    }
}
