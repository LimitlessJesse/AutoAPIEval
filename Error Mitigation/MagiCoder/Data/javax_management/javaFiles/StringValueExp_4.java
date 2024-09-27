import javax.management.StringValueExp;

public class StringValueExp_4 {
    public static void main(String[] args) {
        StringValueExp stringValueExp = new StringValueExp("Hello, World!");
        String value = stringValueExp.getValue();
        System.out.println(value);
    }
}
