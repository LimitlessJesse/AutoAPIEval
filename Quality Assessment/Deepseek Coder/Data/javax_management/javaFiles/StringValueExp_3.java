import javax.management.StringValueExp;

public class StringValueExp_3 {
    public static void main(String[] args) {
        StringValueExp stringValueExp = new StringValueExp("Hello");
        String value = stringValueExp.getValue();
        System.out.println(value);
    }
}
