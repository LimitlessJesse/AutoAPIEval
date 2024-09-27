import org.omg.CORBA.ExceptionList;

public class ExceptionList_4 {
    public static void main(String[] args) {
        ExceptionList exceptionList = new ExceptionList();
        try {
            exceptionList.remove(2);
        } catch (Bounds bounds) {
            System.out.println("Index out of bounds");
        }
    }
}
