import java.util.Arrays;

public class Enum_1 {
    
    public enum ExampleEnum {
        FIRST, SECOND, THIRD;
    }
    
    public static void main(String[] args) {
        
        ExampleEnum first = ExampleEnum.FIRST;
        ExampleEnum second = ExampleEnum.SECOND;
        
        int result = first.compareTo(second);
        
        if (result < 0) {
            System.out.println(first + " comes before " + second);
        } else if (result == 0) {
            System.out.println(first + " is equal to " + second);
        } else {
            System.out.println(first + " comes after " + second);
        }
    }
}
