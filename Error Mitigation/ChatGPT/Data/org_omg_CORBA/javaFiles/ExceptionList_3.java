import org.omg.CORBA.ExceptionList;

public class ExceptionList_3 {
    public static void main(String[] args) {
        ExceptionList exceptionList = new ExceptionList();
        int count = exceptionList.count();
        System.out.println("Number of TypeCode objects in ExceptionList: " + count);
    }
}
