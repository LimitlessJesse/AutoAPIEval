import org.omg.CORBA.portable.InputStream;

public class InputStream_3 {
    public static void main(String[] args) {
        // Create an instance of InputStream
        InputStream inputStream = new InputStream() {
            @Override
            public double read_double() {
                // Simulate reading a double value from the input stream
                return 3.14;
            }
        };
        
        // Read a double value from the input stream
        double value = inputStream.read_double();
        System.out.println("Double value read from input stream: " + value);
    }
}
