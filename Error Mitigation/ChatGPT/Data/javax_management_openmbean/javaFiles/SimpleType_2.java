import javax.management.openmbean.SimpleType;

public class SimpleType_2 {
    public static void main(String[] args) {
        SimpleType<String> simpleType = SimpleType.STRING;
        String value = "Hello";
        
        boolean isValue = simpleType.isValue(value);
        System.out.println("Is value: " + isValue);
    }
}
