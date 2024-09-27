import javax.management.AttributeValueExp;

public class AttributeValueExp_2 {
    public static void main(String[] args) {
        AttributeValueExp attr = new AttributeValueExp() {
            // This is an anonymous class that implements the AttributeValueExp interface
            // We'll just use it to demonstrate the toString() method
        };

        System.out.println(attr.toString());
    }
}
