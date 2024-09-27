import java.net.IDN;

public class IDN_1 {
    public static void main(String[] args) {
        String input = "example.com";
        String aceRepresentation = IDN.toASCII(input);
        System.out.println("ACE representation: " + aceRepresentation);
    }
}
