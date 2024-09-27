import javax.xml.bind.helpers.ValidationEventImpl;

public class ValidationEventImpl_5 {
    public static void main(String[] args) {
        ValidationEventImpl event = new ValidationEventImpl(1, "Error message", null, null);
        
        Throwable linkedException = event.getLinkedException();
        
        if(linkedException != null) {
            System.out.println("Linked Exception: " + linkedException.getMessage());
        } else {
            System.out.println("No linked exception found.");
        }
    }
}
