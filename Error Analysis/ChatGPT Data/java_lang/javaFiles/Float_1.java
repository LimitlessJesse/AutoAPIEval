import java.lang.Float;

public class Float_1 {
    public static void main(String[] args) {
        Float f1 = new Float(5.0);
        Float f2 = new Float(10.0);
        
        int compareResult = f1.compareTo(f2);
        
        if(compareResult < 0) {
            System.out.println(f1 + " is less than " + f2);
        } else if(compareResult > 0) {
            System.out.println(f1 + " is greater than " + f2);
        } else {
            System.out.println(f1 + " is equal to " + f2);
        }
    }
}
