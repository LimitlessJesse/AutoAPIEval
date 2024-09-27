import org.omg.CORBA.ValueBaseHolder;
import org.omg.CORBA_2_3.portable.OutputStream;

public class ValueBaseHolder_2 {
    public static void main(String[] args) {
        ValueBaseHolder holder = new ValueBaseHolder();
        // Set a value in the holder
        holder.value = "Sample Value";
        
        // Create an output stream
        OutputStream outputStream = new OutputStream();
        
        // Call the _write method to marshal the value to the output stream
        holder._write(outputStream);
        
        // Display the marshaled data
        System.out.println("Marshalled data: " + outputStream.toString());
    }
}
