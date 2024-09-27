import org.omg.CORBA.DoubleHolder;
import org.omg.CORBA.portable.InputStream;

public class DoubleHolder_1 {
    public static void main(String[] args) {
        DoubleHolder holder = new DoubleHolder();
        InputStream input = null; // Initialize your input stream here
        
        holder._read(input);
        
        System.out.println("Value stored in holder: " + holder.value);
    }
}
