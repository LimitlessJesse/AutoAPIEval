import org.omg.CORBA.portable.ObjectImpl;

public class ObjectImpl_1 {
    public static void main(String[] args) {
        ObjectImpl obj1 = new ObjectImpl();
        ObjectImpl obj2 = new ObjectImpl();

        boolean isEqual = obj1.equals(obj2);

        System.out.println("Are the two objects equal? " + isEqual);
    }
}
