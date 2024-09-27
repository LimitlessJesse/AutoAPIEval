import java.text.Collator;

public class Collator_5 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        int strength = collator.getStrength();
        System.out.println("Current Comparison Strength: " + strength);
    }
}
