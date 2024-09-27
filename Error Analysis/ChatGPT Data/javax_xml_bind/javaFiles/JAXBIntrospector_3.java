import javax.xml.bind.JAXBIntrospector;

public class JAXBIntrospector_3 {
    
    public static void main(String[] args) {
        Object myObject = new Object(); // Initialize your object here
        boolean elementPresent = JAXBIntrospector.getValue(myObject) != null;
        System.out.println("Is Element Present: " + elementPresent);
    }
}
