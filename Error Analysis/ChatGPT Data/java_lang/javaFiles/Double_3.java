import java.lang.Double;

public class Double_3 {
    public static void main(String[] args) {
        Double num1 = 10.5;
        Double num2 = 20.5;
        
        int comparison = num1.compareTo(num2);
        
        if(comparison < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if(comparison > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
