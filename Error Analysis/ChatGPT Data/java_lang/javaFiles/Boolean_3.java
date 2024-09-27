import java.lang.Boolean;

public class Boolean_3 {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Boolean bool2 = false;
        
        int comparison1 = bool1.compareTo(bool2);
        System.out.println("Comparison 1: " + comparison1); // Output: 1 (true is greater than false)
        
        int comparison2 = bool2.compareTo(bool1);
        System.out.println("Comparison 2: " + comparison2); // Output: -1 (false is less than true)
        
        int comparison3 = bool1.compareTo(true);
        System.out.println("Comparison 3: " + comparison3); // Output: 0 (true is equal to true)
        
        int comparison4 = bool2.compareTo(false);
        System.out.println("Comparison 4: " + comparison4); // Output: 0 (false is equal to false)
    }
}
