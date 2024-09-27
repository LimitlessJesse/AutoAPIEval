import javax.accessibility.AccessibleHyperlink;

public class AccessibleHyperlink_5 {
    
    public static void main(String[] args) {
        AccessibleHyperlink hyperlink = new AccessibleHyperlink();
        boolean isValid = hyperlink.isValid();
        System.out.println("Is hyperlink valid? " + isValid);
    }
}
