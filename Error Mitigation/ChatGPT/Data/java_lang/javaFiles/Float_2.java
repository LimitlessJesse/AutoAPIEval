import java.lang.Float;

public class Float_2 {
    public static void main(String[] args) {
        Float floatValue = new Float(3.14f);
        System.out.println("Is NaN: " + floatValue.isNaN());
        
        Float nanValue = new Float(Float.NaN);
        System.out.println("Is NaN: " + nanValue.isNaN());
    }
}
