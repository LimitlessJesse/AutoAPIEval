import javax.naming.directory.BasicAttributes;

public class BasicAttributes_3 {
    public static void main(String[] args) {
        BasicAttributes attributes = new BasicAttributes();
        boolean caseIgnored = attributes.isCaseIgnored();
        System.out.println("Is case ignored: " + caseIgnored);
    }
}
