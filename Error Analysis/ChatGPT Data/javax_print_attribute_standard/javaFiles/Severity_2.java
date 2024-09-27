import javax.print.attribute.standard.Severity;

public class Severity_2 {
    public static void main(String[] args) {
        Severity severity = new Severity(Severity.REPORT);
        String name = severity.getName();
        System.out.println("Severity name: " + name);
    }
}
